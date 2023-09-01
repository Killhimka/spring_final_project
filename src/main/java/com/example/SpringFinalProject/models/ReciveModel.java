package com.example.SpringFinalProject.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "recive")
@Data
public class ReciveModel {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    long id;
    @Column (name = "name")
    String name;
    @Column(name = "type")
    String type;
    @Column(name = "contact")
    String contact;
    @Column(name = "item_id")
    String itemId;
    @Column(name = "item_name")
    String itemName;
}
