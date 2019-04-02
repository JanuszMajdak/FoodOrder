package januszmajdak.pl.foodorder.repositories;

import januszmajdak.pl.foodorder.entities.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
