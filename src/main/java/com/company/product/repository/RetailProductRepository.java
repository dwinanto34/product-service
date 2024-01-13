package com.company.product.repository;

import com.company.product.model.entity.RetailProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetailProductRepository extends JpaRepository<RetailProduct, String> {

}
