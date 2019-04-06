package pl.januszmajdak.foodorder.services;

import pl.januszmajdak.foodorder.entities.product.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    //public Optional<Product> findByNameIgnoreCase(String name);

}
