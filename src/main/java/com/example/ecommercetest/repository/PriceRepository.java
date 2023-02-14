package com.example.ecommercetest.repository;

import com.example.ecommercetest.domain.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    @Query("select p from Price p where p.brand.brandId = ?2 and p.productId = ?1 and p.startDate <= ?3 and p.endDate >= ?3 order by p.priority desc")
    List<Price> findPriceByBrandIdAndProductIdAndDate(Integer productId, Long brandId, LocalDateTime applicationDate);

}
