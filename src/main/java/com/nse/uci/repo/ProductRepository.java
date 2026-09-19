package com.nse.uci.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nse.uci.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
