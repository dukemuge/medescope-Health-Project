package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.admin.Insurance;
import com.example.demo.services.admin.InsuranceService;

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
public class InsuranceController {

    @Autowired
    InsuranceService insuranceService;

    @GetMapping("/enrollinsurance")
    public String showSignUpForm(Insurance insurance) {
        return "admin/addinsurance";
    }

    @PostMapping("/addinsurance")
    public String addInsurance(@Valid Insurance insurance, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "admin/addInsurance";
        }

        insuranceService.create(insurance);
        model.addAttribute("insurances", insuranceService.findAll());
        return "admin/insurance";
    }

    // additional CRUD methods
    @GetMapping("/edit/insurance/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Insurance insurance = insuranceService.findById(id);
        // .orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" +
        // id));

        model.addAttribute("insurance", insurance);
        return "admin/updateInsurance";
    }

    @PostMapping("/update/insurance/{id}")
    public String updateInsurance(@PathVariable("id") long id, @Valid Insurance insurance, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            insurance.setId(id);
            return "admin/updateInsurance";
        }

        insuranceService.update(insurance);
        model.addAttribute("insurances", insuranceService.findAll());
        return "admin/insurance";
    }

    @GetMapping("/delete/insurance/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        insuranceService.deleteById(id);
        model.addAttribute("insurances", insuranceService.findAll());
        return "admin/insurance";
    }

    @RequestMapping(value = "/viewinsurance", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("insurances", insuranceService.findAll());

        return "patient/viewinsurance";
    }

}