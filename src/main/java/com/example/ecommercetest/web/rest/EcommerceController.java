package com.example.ecommercetest.web.rest;

import com.example.ecommercetest.service.PriceService;
import com.example.ecommercetest.web.rest.model.PriceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {

    @Autowired
    PriceService priceService;

    @GetMapping("/price/{productId}")
    public ResponseEntity<PriceResponse> getPrice(@PathVariable(name = "productId") Integer productId, @RequestParam(name = "brandId") Long brandId, @RequestParam(name = "applicationDate") String date) {
        return new ResponseEntity<>(priceService.getPrice(productId, brandId, date), HttpStatus.OK);
    }
}
