package com.example.ecommercetest.web.rest.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PriceResponse {

    private Integer productId;
    private Long brandId;
    private BigDecimal rate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal finalPrice;

    public PriceResponse(Integer productId, Long brandId, BigDecimal rate, LocalDateTime startDate, LocalDateTime endDate, BigDecimal finalPrice) {
        this.productId = productId;
        this.brandId = brandId;
        this.rate = rate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.finalPrice = finalPrice;
    }
}
