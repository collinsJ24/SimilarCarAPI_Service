package com.kliptokon.similar.car.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="carMakes")
public class CarMake implements Serializable {

    private static final long serialVersionUID = 5313593413859894403L;


    @Id
    @Column(nullable=false)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String make_id;

    public String getMake_id() {
        return make_id;
    }

    public void setMake_id(String make_id) {
        this.make_id = make_id;
    }

    private String make;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    private int model_id;

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    private String model;
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}
