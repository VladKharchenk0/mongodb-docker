package com.gmail.kharchenko55.vlad.converters;

import com.gmail.kharchenko55.vlad.commands.ProductForm;
import com.gmail.kharchenko55.vlad.domain.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId().toHexString());
        productForm.setCategory(product.getCategory());
        productForm.setModel(product.getModel());
        productForm.setProducer(product.getProducer());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());
        return productForm;
    }
}
