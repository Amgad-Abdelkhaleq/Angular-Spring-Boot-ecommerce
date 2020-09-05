package com.luvtocode.ecommerce.dao;

import com.luvtocode.ecommerce.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<Product,Long> {

}