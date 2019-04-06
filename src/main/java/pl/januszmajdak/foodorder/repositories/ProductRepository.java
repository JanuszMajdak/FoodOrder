package pl.januszmajdak.foodorder.repositories;

import pl.januszmajdak.foodorder.entities.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByNameIgnoreCase(String name);
}
