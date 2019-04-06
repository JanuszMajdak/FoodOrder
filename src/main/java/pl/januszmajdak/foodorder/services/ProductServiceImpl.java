package pl.januszmajdak.foodorder.services;

import pl.januszmajdak.foodorder.entities.product.Product;
import pl.januszmajdak.foodorder.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        Iterable<Product> products = productRepository.findAll();

        return StreamSupport.stream(products.spliterator(), true).collect(Collectors.toList());
    }

 /*   @Override
    public Optional<Product> findByNameIgnoreCase(String name) {

        Optional<Product> product = productRepository.findB(name);
        if (product.isPresent()) {
            return Optional.of(product);
        }

        return Optional.empty();
    }*/
}
