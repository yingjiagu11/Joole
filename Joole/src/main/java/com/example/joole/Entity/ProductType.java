package com.example.joole.Entity;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@EnableAutoConfiguration
public class ProductType {


    private Integer productTypeId;
    private int productId;
    private String application;
    private String type;
    private String mountingLocation;
    private String accessories;

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMountingLocation() {
        return mountingLocation;
    }

    public void setMountingLocation(String mountingLocation) {
        this.mountingLocation = mountingLocation;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public Date getModelYear() {
        return modelYear;
    }

    public void setModelYear(Date modelYear) {
        this.modelYear = modelYear;
    }

    private Date modelYear;

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Id
    public Integer getProductTypeId() {
        return productTypeId;
    }
}
