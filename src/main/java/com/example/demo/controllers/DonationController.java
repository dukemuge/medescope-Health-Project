package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.admin.Insurance;
import com.example.demo.models.patient.Donation;
import com.example.demo.services.admin.InsuranceService;
import com.example.demo.services.patient.DonationService;

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
public class DonationController {
    @Autowired
    DonationService donationService;

    @GetMapping("/sentdonation")
    public String sentDonation() {
        return "patient/sentdonation";
    }
   

    @GetMapping("/enrolldonation")
    public String showSignUpForm(Donation donation) {
        return "patient/addDonation";
    }

    @PostMapping("/adddonation")
    public String addDonation(@Valid Donation donation, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "patient/addDonation";
        }

        donationService.create(donation);
        // model.addAttribute("insurances", insuranceService.findAll());
        return "redirect:/sentdonation";
    }

    @GetMapping("/delete/donation/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        donationService.deleteById(id);
        model.addAttribute("donations", donationService.findAll());
        return "admin/donation";
    }

    @RequestMapping(value = "/viewdonation", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("donations", donationService.findAll());
        return "admin/donation";
    }

}