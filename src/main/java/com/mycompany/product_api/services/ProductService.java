package com.mycompany.product_api.services;

import com.mycompany.product_api.dtos.ProductRecordDTO;
import com.mycompany.product_api.models.ProductModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {
    ProductModel saveProduct(ProductRecordDTO productRecordDTO);
    List<ProductModel> getAllProducts();
    Optional<ProductModel> getOneProduct(UUID id);
    ProductModel updateProduct(UUID id, ProductRecordDTO productRecordDTO);
    void deleteProduct(UUID id);
}
