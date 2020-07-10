package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.clerk.Wardd;
import com.example.demo.services.clerk.WarddService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WarddController {

    @Autowired
    WarddService warddService;

    @GetMapping("/enrollwardd")
    public String showSignUpForm(Wardd wardd) {
        return "clerk/addWardd";
    }

    @PostMapping("/addwardd")
    public String addWardd(@Valid Wardd wardd, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "clerk/addWardd";
        }

        warddService.create(wardd);
        model.addAttribute("wardds", warddService.findAll());
        return "clerk/wardd";
    }

    // additional CRUD methods
    @GetMapping("/edit/wardd/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Wardd wardd = warddService.findById(id);
        // .orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" +
        // id));

        model.addAttribute("wardd", wardd);
        return "clerk/updateWardd";
    }

    @PostMapping("/update/wardd/{id}")
    public String updateWardd(@PathVariable("id") long id, @Valid Wardd wardd, BindingResult result, Model model) {
        if (result.hasErrors()) {
            wardd.setId(id);
            return "clerk/updateWardd";
        }

        warddService.update(wardd);
        model.addAttribute("wardds", warddService.findAll());
        return "clerk/wardd";
    }

    @GetMapping("/delete/wardd/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        warddService.deleteById(id);
        model.addAttribute("wardds", warddService.findAll());
        return "clerk/wardd";
    }
}