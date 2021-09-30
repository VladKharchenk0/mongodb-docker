package com.gmail.kharchenko55.vlad.converters;

import com.gmail.kharchenko55.vlad.commands.ProductForm;
import com.gmail.kharchenko55.vlad.domain.Product;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {

    @Override
    public Product convert(ProductForm productForm) {
        Product product = new Product();
        if (productForm.getId() != null && !StringUtils.isEmpty(productForm.getId())) {
            product.setId(new ObjectId(productForm.getId()));
        }
        product.setCategory(productForm.getCategory());
        product.setModel(productForm.getModel());
        product.setProducer(productForm.getProducer());
        product.setImageUrl(productForm.getImageUrl());
        product.setDescription(productForm.getDescription());
        product.setPrice(productForm.getPrice());
        product.setImageUrl(productForm.getImageUrl());
        return product;
    }
}
