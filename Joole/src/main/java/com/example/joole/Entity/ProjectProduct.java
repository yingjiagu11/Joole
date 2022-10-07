package com.example.joole.Entity;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@EnableAutoConfiguration
public class ProjectProduct {

    private Integer productId;
    //
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    private Integer projectId;
    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    private Integer ppId;

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Id
    public Integer getProductId() {
        return productId;
    }
}
