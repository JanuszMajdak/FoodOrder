package januszmajdak.pl.foodorder.controllers;

import januszmajdak.pl.foodorder.entities.product.Product;
import januszmajdak.pl.foodorder.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Optional;

@Controller
public class ProductController {


    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/meal/{name}")
    public String showProduct(@PathVariable String name, Model model) {

        Optional<Product> product = productRepository.findByNameIgnoreCase(name.replaceAll("-", ""));
        product.ifPresent(product1 -> model.addAttribute("product", product1));
        return product.map(product1 -> "product").orElse("redirect:/");
    }


}
