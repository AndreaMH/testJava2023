package com.example.ecommercetest.mapper;

import com.example.ecommercetest.domain.Price;
import com.example.ecommercetest.web.rest.model.PriceResponse;

import java.math.BigDecimal;

public class PriceMapper {

    public static PriceResponse fromPriceEntityToPriceResponse(Price price) {
        return new PriceResponse(price.getProductId(),
                price.getBrand().getBrandId(),
                price.getPrice(),
                price.getStartDate(),
                price.getEndDate(),
                price.getPrice().multiply(new BigDecimal(price.getPriceList())));
    }

}
