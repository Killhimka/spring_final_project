package com.example.SpringFinalProject.controllers;
import com.example.SpringFinalProject.models.AdvertModel;
import com.example.SpringFinalProject.repos.AdvertRep;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/addAdvert")
public class addAdvertController {
    final
    AdvertRep advertRep;
    public addAdvertController(AdvertRep advertRep) {
        this.advertRep = advertRep;
    }

    @PostMapping
    public String postData(@RequestParam String name, @RequestParam String price,
                           @RequestParam String weight, @RequestParam String disc,
                           @RequestParam String size){
        AdvertModel advertModel = new AdvertModel();
        advertModel.setDisc(disc);
        advertModel.setPrice(price);
        advertModel.setWeight(weight);
        advertModel.setName(name);
        advertModel.setSize(size);
        advertRep.save(advertModel);
        return "index";
    }
    @GetMapping
    public String getAddItems(){
        return "addAdvert";
    }
}
