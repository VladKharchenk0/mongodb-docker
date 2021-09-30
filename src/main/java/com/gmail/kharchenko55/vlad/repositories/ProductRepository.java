package com.gmail.kharchenko55.vlad.repositories;

import com.gmail.kharchenko55.vlad.domain.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, String> {
}
