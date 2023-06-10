package com.example.SpringFinalProject.models;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "item_model")
@Data
public class AdvertModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "price")
     String price;
    @Column(name = "weight")
     String weight;
    @Column(name = "disc")
     String disc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }
}
