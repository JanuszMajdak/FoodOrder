package januszmajdak.pl.foodorder.repositories;

import januszmajdak.pl.foodorder.entities.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByNameIgnoreCase(String name);
}
