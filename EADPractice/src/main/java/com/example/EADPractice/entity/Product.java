package com.example.EADPractice.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodId;

    @Column(name = "name")
    private String prodName;

    @Column(name = "des")
    private String description;

    @Column(name = "date")
    private String dateOfManf;

    @Column(name = "price")
    private int price;

    @OneToMany(mappedBy = "product")
    private List<Sale> sales;

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateOfManf() {
        return dateOfManf;
    }

    public void setDateOfManf(String dateOfManf) {
        this.dateOfManf = dateOfManf;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
