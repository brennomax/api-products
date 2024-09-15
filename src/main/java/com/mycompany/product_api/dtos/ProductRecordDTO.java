package com.mycompany.product_api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProductRecordDTO(@NotBlank(message = "É necessário incluir um nome ao produto.") String name,
                               @PositiveOrZero(message = "O preço deve ser igual ou maior que zero.")
                               @NotNull(message = "Campo preço não pode ser vazio.") BigDecimal value) {
}