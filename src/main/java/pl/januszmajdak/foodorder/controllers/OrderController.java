package pl.januszmajdak.foodorder.controllers;

import pl.januszmajdak.foodorder.CustomerOrder;
import pl.januszmajdak.foodorder.entities.order.Order;
import pl.januszmajdak.foodorder.entities.product.Product;
import pl.januszmajdak.foodorder.messages.Message;
import pl.januszmajdak.foodorder.repositories.OrderRepository;
import pl.januszmajdak.foodorder.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Optional;

@Controller
public class OrderController {

    private CustomerOrder customerOrder;
    private ProductRepository productRepository;
    private OrderRepository orderRepository;

    @Autowired
    public OrderController(CustomerOrder customerOrder, ProductRepository productRepository, OrderRepository orderRepository) {
        this.customerOrder = customerOrder;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }


    @GetMapping("/order/add")
    public String addProductToOrder(@RequestParam Long productId, Model model) {

        Optional<Product> product = productRepository.findById(productId);

        product.ifPresent(customerOrder::addProduct);

        if (product.isPresent()) {
            model.addAttribute("message", new Message("Dodano", "Dodano do zamówienia: " + product.get().getName()));
        } else {
            model.addAttribute("message", new Message("Nie dodano", "Niepoprawna pozycja została wybrana z menu: " + productId));
        }
        return "message";
    }

    @GetMapping("/order")
    public String getCurrentOrder(Model model) {
        model.addAttribute("order", customerOrder.getOrder());
        model.addAttribute("sum", customerOrder
                .getOrder()
                .getProducts().stream().mapToDouble(Product::getPrice)
                .sum());
        return "order";
    }

@PostMapping("/order/realize")
    public String proceedOrder(@RequestParam String address, @RequestParam String telephone, Model model) {
        Order order = customerOrder.getOrder();
        order.setAddress(address);
        order.setTelephone(telephone);
        orderRepository.save(order);
        customerOrder.clear();
        model.addAttribute("message", new Message("Dziękujemy"," Zamówienie zostało przekazane do realizacji."));
        return "message";
    }


}
