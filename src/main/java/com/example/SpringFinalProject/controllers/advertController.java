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
@RequestMapping("/advert")
public class advertController {
    final
    AdvertRep advertRep;

    public advertController(AdvertRep advertRep) {
        this.advertRep = advertRep;
    }
    /*@GetMapping
    public String  getAdvert (Model model, int id) {
        List<AdvertModel> list = new ArrayList<>();
        list = (List<AdvertModel>) advertRep.findById(AdvertModel.class,id).get();
        model.addAttribute("allAdverts",list);
        return "adv";
    }*/
    @GetMapping
    public String getAdvert(){
        return "advert";
    }
}
