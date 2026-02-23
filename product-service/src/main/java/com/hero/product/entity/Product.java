package com.hero.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;

	    private String description;

	    @Column(nullable = false)
	    private Double price;

	    public Product() {}

	    public Product(String name, String description, Double price) {
	        this.name = name;
	        this.description = description;
	        this.price = price;
	    }

	    public Long getId() { return id; }
	    public String getName() { return name; }
	    public String getDescription() { return description; }
	    public Double getPrice() { return price; }

	    public void setId(Long id) { this.id = id; }
	    public void setName(String name) { this.name = name; }
	    public void setDescription(String description) { this.description = description; }
	    public void setPrice(Double price) { this.price = price; }

}
