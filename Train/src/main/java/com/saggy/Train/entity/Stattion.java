package com.saggy.Train.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Stattion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stattionName;

    private String stattionCode;

    public Stattion(){

    }

    public Stattion(Long id, String stattionCode, String stattionName) {
        this.id = id;
        this.stattionCode = stattionCode;
        this.stattionName = stattionName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStattionCode() {
        return stattionCode;
    }

    public void setStattionCode(String stattionCode) {
        this.stattionCode = stattionCode;
    }

    public String getStattionName() {
        return stattionName;
    }

    public void setStattionName(String stattionName) {
        this.stattionName = stattionName;
    }
}
