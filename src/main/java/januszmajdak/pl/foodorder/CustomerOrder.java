package januszmajdak.pl.foodorder;

import januszmajdak.pl.foodorder.entities.order.Order;
import januszmajdak.pl.foodorder.entities.order.OrderStatus;
import januszmajdak.pl.foodorder.entities.product.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CustomerOrder {
    private Order order;

    public CustomerOrder() {
        clear();
    }

   public Order getOrder() {
        return order;
    }

    public void addProduct(Product product) {
        order.getProducts().add(product);
    }


    public void clear() {
        order = new Order();
        order.setStatus(OrderStatus.NEW);
    }
}
