package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.patient.Recordp;
import com.example.demo.services.patient.RecordpService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecordpController {

    @Autowired
    RecordpService recordpService;

    @GetMapping("/enrollrecordp")
    public String showSignUpForm(Recordp recordp) {
        return "patient/addRecordp";
    }

    @PostMapping("/addrecordp")
    public String addRecordp(@Valid Recordp recordp, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "patient/addRecordp";
        }

        recordpService.create(recordp);
        model.addAttribute("recordps", recordpService.findAll());
        return "patient/recordp";
    }

    // additional CRUD methods
    @GetMapping("/edit/recordp/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Recordp recordp = recordpService.findById(id);
        // .orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" +
        // id));

        model.addAttribute("recordp", recordp);
        return "patient/updateRecordp";
    }

    @PostMapping("/update/recordp/{id}")
    public String updateRecordp(@PathVariable("id") long id, @Valid Recordp recordp, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            recordp.setId(id);
            return "patient/updateRecordp";
        }

        recordpService.update(recordp);
        model.addAttribute("recordps", recordpService.findAll());
        return "patient/recordp";
    }

    @GetMapping("/delete/recordp/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        recordpService.deleteById(id);
        model.addAttribute("recordps", recordpService.findAll());
        return "patient/recordp";
    }
}