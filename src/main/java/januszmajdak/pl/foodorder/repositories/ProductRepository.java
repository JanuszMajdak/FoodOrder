package januszmajdak.pl.foodorder.repositories;

import januszmajdak.pl.foodorder.entities.product.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
