package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.doctor.Record;
import com.example.demo.services.doctor.RecordService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecordController {

    @Autowired
    RecordService recordService;

    @GetMapping("/enrollrecord")
    public String showSignUpForm(Record record) {
        return "doctor/addRecord";
    }

    @PostMapping("/addrecord")
    public String addRecord(@Valid Record record, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "doctor/addRecord";
        }

        recordService.create(record);
        model.addAttribute("records", recordService.findAll());
        return "doctor/record";
    }

    // additional CRUD methods
    @GetMapping("/edit/record/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Record record = recordService.findById(id);
        // .orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" +
        // id));

        model.addAttribute("record", record);
        return "doctor/updateRecord";
    }

    @PostMapping("/update/record/{id}")
    public String updateRecord(@PathVariable("id") long id, @Valid Record record, BindingResult result, Model model) {
        if (result.hasErrors()) {
            record.setId(id);
            return "doctor/updateRecord";
        }

        recordService.update(record);
        model.addAttribute("records", recordService.findAll());
        return "doctor/record";
    }

    // @GetMapping("/delete/insurance/{id}")
    // public String deleteInsurance(@PathVariable("id") long id, Model model) {
    // Insurance insurance =insuranceService.findById(id);
    // //.orElseThrow(() -> new IllegalArgumentException("Invalid insurance Id:" +
    // id));
    // insuranceService.deleteById(insurance);
    // model.addAttribute("insurances", insuranceService.findAll());
    // return "admin/insurance";
    // }

    @GetMapping("/delete/record/{id}")
    public String deleteById(@PathVariable("id") long id, Model model) {
        recordService.deleteById(id);
        model.addAttribute("records", recordService.findAll());
        return "doctor/record";
    }
}