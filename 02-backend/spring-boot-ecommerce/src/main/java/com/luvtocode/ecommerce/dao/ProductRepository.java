package com.luvtocode.ecommerce.dao;

import com.luvtocode.ecommerce.entity.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductRepository extends JpaRepository<ProductCategory,Long> {

}