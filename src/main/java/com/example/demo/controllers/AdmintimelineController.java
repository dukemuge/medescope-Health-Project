package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * controller.
 */
@Controller
public class AdmintimelineController {

    @GetMapping("/viewadmintimeline")
    public String showLabtech() {
        return "admin/admintimeline";
    }

}