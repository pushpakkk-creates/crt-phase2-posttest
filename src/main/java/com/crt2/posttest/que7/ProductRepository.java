package com.crt2.posttest.que7;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price < :price AND p.category = :category")
    List<Product> findProducts(@Param("price") double price,
                               @Param("category") String category);
}