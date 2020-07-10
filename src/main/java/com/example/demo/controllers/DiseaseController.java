package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * controller.
 */
@Controller
public class DiseaseController {

    @GetMapping("/viewdisease")
    public String showDisease() {
        return "doctor/disease";
    }

}