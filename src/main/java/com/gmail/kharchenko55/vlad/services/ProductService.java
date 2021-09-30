package com.gmail.kharchenko55.vlad.services;

import com.gmail.kharchenko55.vlad.commands.ProductForm;
import com.gmail.kharchenko55.vlad.domain.Product;

import java.util.List;


public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
