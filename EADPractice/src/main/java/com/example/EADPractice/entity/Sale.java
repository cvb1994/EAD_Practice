package com.example.EADPractice.entity;

import javax.persistence.*;

@Entity
@Table( name = "sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slNo;

    @Column(name = "salemanId")
    private String salemanId;

    @Column(name = "salemanName")
    private String salemanName;

    @Column(name = "dos")
    private String dos;

    @ManyToOne
    @JoinColumn(name = "prodId", insertable = false, updatable = false)
    private Product product;

    public int getSlNo() {
        return slNo;
    }

    public void setSlNo(int slNo) {
        this.slNo = slNo;
    }

    public String getSalemanId() {
        return salemanId;
    }

    public void setSalemanId(String salemanId) {
        this.salemanId = salemanId;
    }

    public String getSalemanName() {
        return salemanName;
    }

    public void setSalemanName(String salemanName) {
        this.salemanName = salemanName;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
