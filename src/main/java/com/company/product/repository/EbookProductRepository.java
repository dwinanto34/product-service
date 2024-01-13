package com.company.product.repository;

import com.company.product.model.entity.EbookProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EbookProductRepository extends JpaRepository<EbookProduct, String> {

}
