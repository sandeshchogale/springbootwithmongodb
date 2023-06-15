package com.springboot.javaguides.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.javaguides.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long>{

}
