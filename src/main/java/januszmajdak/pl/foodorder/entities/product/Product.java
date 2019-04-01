package januszmajdak.pl.foodorder.entities.product;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal price;
    private String name;
    private String briefDescription;
    @Column(length = 1024)
    private String description;

    public Product() {
    }

    public Product(Long id, BigDecimal price, String name, String briefDescription, String description) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.briefDescription = briefDescription;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
