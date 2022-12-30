package com.br.artur.produtoApi.dto;

import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

@Data
@Builder
@With
public class RequestDto {

    private Long barCode;
    private String code, category, series, description, color, material, name;
    private BigDecimal grossAmount, taxes, price;
    private Integer quantity;
    private Instant manufacturingDate, expirationDate;
}
