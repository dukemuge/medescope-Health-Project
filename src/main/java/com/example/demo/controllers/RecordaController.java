package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.clerk.Recorda;
import com.example.demo.services.clerk.RecordaService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecordaController {

    @Autowired
    RecordaService recordaService;

    @GetMapping("/enrollrecorda")
    public String showSignUpForm(Recorda recorda) {
        return "clerk/addRecorda";
    }

    @PostMapping("/addrecorda")
    public String addRecorda(@Valid Recorda recorda, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "clerk/addRecorda";
        }
    recordaService.create(recorda);
        model.addAttribute("recordas", recordaService.findAll());
        return "clerk/recordas";
    }

    // additional CRUD methods
    @GetMapping("/edit/recorda/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
    Recorda recorda = recordaService.findById(id);
                //.orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" + id));

        model.addAttribute("recorda", recorda);
        return "clerk/updateRecorda";
    }

    @PostMapping("/update/recorda/{id}")
    public String updateRecorda(@PathVariable("id") long id, @Valid Recorda recorda, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            recorda.setId(id);
            return "clerk/updateRecorda";
        }

        recordaService.update(recorda);
        model.addAttribute("recordas", recordaService.findAll());
        return "clerk/recorda";
    }

  
    @GetMapping("/delete/recorda/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        recordaService.deleteById(id);
        model.addAttribute("recordas", recordaService.findAll());
        return "clerk/recorda";
    }
}