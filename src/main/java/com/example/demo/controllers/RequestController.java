package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.patient.Request;
import com.example.demo.services.patient.RequestService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestController {
    @Autowired
    RequestService requestService;

    @GetMapping("/sentrequest")
    public String sentRequest() {
        return "patient/sentrequest";
    }

    @GetMapping("/enrollrequest")
    public String showSignUpForm(Request request) {
        return "patient/addRequest";
    }

    @PostMapping("/addrequest")
    public String addRequest(@Valid Request request, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "patient/addRequest";
        }

        requestService.create(request);
        // model.addAttribute("insurances", insuranceService.findAll());
        return "redirect:/sentrequest";
    }

    @GetMapping("/delete/request/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        requestService.deleteById(id);
        model.addAttribute("requests", requestService.findAll());
        return "admin/request";
    }

    @RequestMapping(value = "/viewrequest", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("requests", requestService.findAll());
        return "admin/request";
    }

}