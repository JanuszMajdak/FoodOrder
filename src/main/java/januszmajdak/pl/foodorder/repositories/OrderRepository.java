package januszmajdak.pl.foodorder.repositories;

import januszmajdak.pl.foodorder.entities.order.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
