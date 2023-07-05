package com.pwgtil.springbootplayground;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;

@Entity// @Entity, @Document, @KeySpace
class Treadmill {

    private String code;
    private String model;

    @Override
    public String toString() {
        return "Treadmill(code: %s, model: %s)"
                .formatted(this.getCode(), this.getModel());
    }

    public Treadmill(String code, String model) {
        this.code = code;
        this.model = model;
    }
    public Treadmill() {

    }

    @jakarta.persistence.Id
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}

interface TreadmillRepository extends CrudRepository<Treadmill, String> {

}
