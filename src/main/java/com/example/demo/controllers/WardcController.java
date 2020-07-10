package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.clerk.Wardc;
import com.example.demo.services.clerk.WardcService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WardcController {

    @Autowired
    WardcService wardcService;

    @GetMapping("/enrollwardc")
    public String showSignUpForm(Wardc wardc) {
        return "clerk/addWardc";
    }

    @PostMapping("/addwardc")
    public String addWardc(@Valid Wardc wardc, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "clerk/addWardc";
        }

        wardcService.create(wardc);
        model.addAttribute("wardcs", wardcService.findAll());
        return "clerk/wardc";
    }

    // additional CRUD methods
    @GetMapping("/edit/wardc/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Wardc wardc = wardcService.findById(id);
        // .orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" +
        // id));

        model.addAttribute("wardc", wardc);
        return "clerk/updateWardc";
    }

    @PostMapping("/update/wardc/{id}")
    public String updateWardc(@PathVariable("id") long id, @Valid Wardc wardc, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            wardc.setId(id);
            return "wardc/updateWardc";
        }

        wardcService.update(wardc);
        model.addAttribute("wardcs", wardcService.findAll());
        return "clerk/wardc";
    }

   

    @GetMapping("/delete/wardc/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        wardcService.deleteById(id);
        model.addAttribute("wardcs", wardcService.findAll());
        return "clerk/wardc";
    }
}