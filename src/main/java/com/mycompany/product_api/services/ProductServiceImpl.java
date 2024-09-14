package com.mycompany.product_api.services;

import com.mycompany.product_api.dtos.ProductRecordDTO;
import com.mycompany.product_api.models.ProductModel;
import com.mycompany.product_api.repositories.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductModel saveProduct(ProductRecordDTO productRecordDTO) {
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productRecordDTO, productModel);
        return productRepository.save(productModel);
    }

    @Override
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductModel> getOneProduct(UUID id) {
        return productRepository.findById(id);
    }

    @Override
    public ProductModel updateProduct(UUID id, ProductRecordDTO productRecordDTO) {
        var productModel = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        BeanUtils.copyProperties(productRecordDTO, productModel);
        return productRepository.save(productModel);
    }

    @Override
    public void deleteProduct(UUID id) {
        var productModel = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.delete(productModel);
    }
}