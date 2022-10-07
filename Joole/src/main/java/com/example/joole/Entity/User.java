package com.example.joole.Entity;

import org.springframework.boot.autoconfigure.AutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@AutoConfiguration
public class User {
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public void setName(String name) {
        this.name = name;
    }

    @Id
    public String getName() {
        return name;
    }
}
