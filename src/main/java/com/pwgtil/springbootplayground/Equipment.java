package com.pwgtil.springbootplayground;

import jakarta.persistence.*;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;

@Entity// @Entity, @Document, @KeySpace
@Table(name = "Equipment")
class Treadmill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(name = "equipment_code")
    private String code;

    private String model;

    @Temporal(TemporalType.DATE)
    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "current_status")
    private EquipmentStatus status;

    @Transient
    private int internalStatus;

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

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public EquipmentStatus getStatus() {
        return status;
    }

    public void setStatus(EquipmentStatus status) {
        this.status = status;
    }
}

interface TreadmillRepository extends CrudRepository<Treadmill, String> {

}

enum EquipmentStatus {
    NEW, IN_USE, BROKEN
}
