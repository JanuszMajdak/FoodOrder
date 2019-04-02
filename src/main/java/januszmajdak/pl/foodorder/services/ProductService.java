package januszmajdak.pl.foodorder.services;

import januszmajdak.pl.foodorder.entities.product.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> findAll();
    //public Optional<Product> findByNameIgnoreCase(String name);

}
