package com.example.joole.Entity;


import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@EnableAutoConfiguration
public class TechnicalDetail {
    private Integer technicalDetailId;
    private int productId;
    private int airflow;
    private int power;
    private int operatingVoltage;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAirflow() {
        return airflow;
    }

    public void setAirflow(int airflow) {
        this.airflow = airflow;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getOperatingVoltage() {
        return operatingVoltage;
    }

    public void setOperatingVoltage(int operatingVoltage) {
        this.operatingVoltage = operatingVoltage;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    private int fanSpeed;

    public void setTechnicalDetailId(Integer technicalDetailId) {
        this.technicalDetailId = technicalDetailId;
    }

    @Id
    public Integer getTechnicalDetailId() {
        return technicalDetailId;
    }
}
