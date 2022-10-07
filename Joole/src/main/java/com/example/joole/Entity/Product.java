package com.example.joole.Entity;


import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

@Entity
@EnableAutoConfiguration
public class Product {
    private Long id;

    





    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }


    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public TechnicalDetail getTechnicalDetail() {
        return technicalDetail;
    }

    public void setTechnicalDetail(TechnicalDetail technicalDetail) {
        this.technicalDetail = technicalDetail;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    @OneToOne
    @JoinColumn(name = "product_type")
    private ProductType productType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "technical_detail_id")
    private TechnicalDetail technicalDetail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "description")
    private Description description;
    private String brand;
    private String certification;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
