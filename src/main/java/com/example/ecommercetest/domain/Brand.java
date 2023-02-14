package com.example.ecommercetest.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BRAND_ID")
    private Long brandId;

    @Column(name = "BRAND_NAME")
    private String brandName;

}
