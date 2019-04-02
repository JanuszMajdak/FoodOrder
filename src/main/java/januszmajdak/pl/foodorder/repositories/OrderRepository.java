package januszmajdak.pl.foodorder.repositories;

import januszmajdak.pl.foodorder.entities.order.Order;
import januszmajdak.pl.foodorder.entities.order.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order>findAllByStatus(OrderStatus status);
}
