package com.example.SpringFinalProject.models;


import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "advert_shop_model")
@Data
public class AdvertModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "name")
    String name;
    @Column(name = "price")
     String price;
    @Column(name = "weight")
     String weight;
    @Column(name = "disc")
     String disc;
    @Column(name = "size")
    String size;
}
