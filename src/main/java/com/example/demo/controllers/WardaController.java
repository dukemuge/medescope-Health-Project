package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.clerk.Warda;

import com.example.demo.services.clerk.WardaService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WardaController {

    @Autowired
    WardaService wardaService;

    @GetMapping("/enrollwarda")
    public String showSignUpForm(Warda warda) {
        return "clerk/addwarda";
    }

    @PostMapping("/addwarda")
    public String addWarda(@Valid Warda warda, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "clerk/addWarda";
        }

        wardaService.create(warda);
        model.addAttribute("wardas", wardaService.findAll());
        return "clerk/warda";
    }

    // additional CRUD methods
    @GetMapping("/edit/warda/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Warda warda = wardaService.findById(id);
        // .orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" +
        // id));

        model.addAttribute("warda", warda);
        return "clerk/updateWarda";
    }

    @PostMapping("/update/warda/{id}")
    public String updateWarda(@PathVariable("id") long id, @Valid Warda warda, BindingResult result, Model model) {
        if (result.hasErrors()) {
            warda.setId(id);
            return "clerk/updateWarda";
        }

        wardaService.update(warda);
        model.addAttribute("wardas", wardaService.findAll());
        return "clerk/warda";
    }

    @GetMapping("/delete/warda/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        wardaService.deleteById(id);
        model.addAttribute("wardas", wardaService.findAll());
        return "clerk/warda";
    }
}