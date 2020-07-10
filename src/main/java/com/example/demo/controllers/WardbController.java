package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.admin.Insurance;
import com.example.demo.models.clerk.Wardb;
import com.example.demo.services.admin.InsuranceService;
import com.example.demo.services.clerk.WardbService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WardbController {

    @Autowired
    WardbService wardbService;

    @GetMapping("/enrollwardb")
    public String showSignUpForm(Wardb wardb) {
        return "clerk/addWardb";
    }

    @PostMapping("/addwardb")
    public String addWardb(@Valid Wardb wardb, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "clerk/addWardb";
        }

        wardbService.create(wardb);
        model.addAttribute("wardbs", wardbService.findAll());
        return "clerk/wardb";
    }

    // additional CRUD methods
    @GetMapping("/edit/wardb/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Wardb wardb = wardbService.findById(id);
                //.orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" + id));

        model.addAttribute("wardb", wardb);
        return "clerk/updateWardb";
    }

    @PostMapping("/update/wardb/{id}")
    public String updateWardb(@PathVariable("id") long id, @Valid Wardb wardb, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            wardb.setId(id);
            return "clerk/updateWardb";
        }

        wardbService.update(wardb);
        model.addAttribute("wardbs", wardbService.findAll());
        return "clerk/wardb";
    }

    // @GetMapping("/delete/insurance/{id}")
    // public String deleteInsurance(@PathVariable("id") long id, Model model) {
    //     Insurance insurance =insuranceService.findById(id);
    //             //.orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" + id));
    //     insuranceService.deleteById(insurance);
    //     model.addAttribute("insurances", insuranceService.findAll());
    //     return "admin/insurance";
    // }

    @GetMapping("/delete/wardb/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        wardbService.deleteById(id);
        model.addAttribute("wardbs", wardbService.findAll());
        return "clerk/wardb";
    }
}