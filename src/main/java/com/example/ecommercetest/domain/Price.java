package com.example.ecommercetest.domain;

import com.example.ecommercetest.util.LocalDateTimeUtils;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PRICES")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "BRAND_ID")
    private Brand brand;

    @Column(name = "START_DATE", nullable = false)
    @Convert(converter = LocalDateTimeUtils.class)
    private LocalDateTime startDate;

    @Column(name = "END_DATE", nullable = false)
    @Convert(converter = LocalDateTimeUtils.class)
    private LocalDateTime endDate;

    @Column(name = "PRICE_LIST", nullable = false)
    private Integer priceList;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Integer productId;

    @Column(name = "PRIORITY", nullable = false)
    private Integer priority;

    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @Column(name = "CURR", nullable = false)
    private String currency;

}
