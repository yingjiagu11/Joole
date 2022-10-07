package com.example.joole.Entity;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@EnableAutoConfiguration
public class Description {
    private Integer descriptionId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    private Integer productId;
    private String manufacturer;
    private String series;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private String model;

    public void setDescriptionId(Integer descriptionId) {
        this.descriptionId = descriptionId;
    }

    @Id
    public Integer getDescriptionId() {
        return descriptionId;
    }
}
