package com.example.ecommercetest.service;

import com.example.ecommercetest.mapper.PriceMapper;
import com.example.ecommercetest.repository.PriceRepository;
import com.example.ecommercetest.web.rest.model.PriceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class PriceService {

    @Autowired
    PriceRepository priceRepository;

    public PriceResponse getPrice(Integer productId, Long brandId, String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        return priceRepository.findPriceByBrandIdAndProductIdAndDate(productId, brandId, dateTime)
                .stream()
                .findFirst()
                .map(PriceMapper::fromPriceEntityToPriceResponse)
                .orElseThrow(() -> new NullPointerException("There are no results for your search"));
    }
}
