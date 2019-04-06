package pl.januszmajdak.foodorder.repositories;

import pl.januszmajdak.foodorder.entities.order.Order;
import pl.januszmajdak.foodorder.entities.order.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order>findAllByStatus(OrderStatus status);
}
