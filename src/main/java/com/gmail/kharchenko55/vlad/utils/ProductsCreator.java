package com.gmail.kharchenko55.vlad.utils;

import com.gmail.kharchenko55.vlad.commands.ProductForm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProductsCreator {
    private static final Random rand = new Random();

    public static List<ProductForm> buildProductList() {
        List<ProductForm> products = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            ProductForm product = createUniqueProduct();
            products.add(product);
        }

        return products;
    }

    private static ProductForm createUniqueProduct() {
        List<String> categories = Arrays.asList("Phone", "TV", "Smart Watch", "Laptop", "PC");
        List<String> models = Arrays.asList("iPhone 6", "iPhone 8", "OnePlus 7 Pro", "HP Z Book", "LG 123");
        List<String> producers = Arrays.asList("Apple", "LG", "OnePlus", "HP", "Lenovo");
        List<Integer> prices = Arrays.asList(100, 200, 300, 400, 500);
        List<String> descriptions = Arrays.asList("Cool", "Boring", "Bed", "Nice", "Awful");
        List<String> imageUrls = Arrays.asList("url1", "url2", "url3", "url4", "url5");

        ProductForm productForm = new ProductForm();
        productForm.setCategory(categories.get(rand.nextInt(categories.size())));
        productForm.setModel(models.get(rand.nextInt(models.size())));
        productForm.setProducer(producers.get(rand.nextInt(producers.size())));
        productForm.setPrice(prices.get(rand.nextInt(prices.size())));
        productForm.setDescription(descriptions.get(rand.nextInt(descriptions.size())));
        productForm.setImageUrl(imageUrls.get(rand.nextInt(imageUrls.size())));

        return productForm;
    }
}
