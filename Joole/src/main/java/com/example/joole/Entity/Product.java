package com.example.joole.Entity;


import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@EnableAutoConfiguration
public class Product {
    private Long id;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getTechnicalDetailId() {
        return technicalDetailId;
    }

    public void setTechnicalDetailId(int technicalDetailId) {
        this.technicalDetailId = technicalDetailId;
    }

    public int getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }

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

    private int typeId;
    private int technicalDetailId;
    private int descriptionId;
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
