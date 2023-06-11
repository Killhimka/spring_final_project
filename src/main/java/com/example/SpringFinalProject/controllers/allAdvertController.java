package com.example.SpringFinalProject.controllers;

import com.example.SpringFinalProject.models.AdvertModel;
import com.example.SpringFinalProject.repos.AdvertRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/allAdverts")
public class allAdvertController {
    final
    AdvertRep advertRep;

    public allAdvertController(AdvertRep advertRep) {
        this.advertRep = advertRep;
    }

    @GetMapping
    public String  getAdverts (Model model){
        List <AdvertModel> list = new ArrayList<>();
        list = (List<AdvertModel>) advertRep.findAll();
        model.addAttribute("allAdverts",list);
        return "allAdverts";
    }
    /*@GetMapping
    public String getAllItems(){
        return "allAdvert";
    }*/
}
