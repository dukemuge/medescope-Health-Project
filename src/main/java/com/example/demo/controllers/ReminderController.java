package com.example.demo.controllers;

import com.example.demo.models.doctor.Reminder;
import com.example.demo.services.doctor.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller.
 */
@Controller
public class ReminderController {

    private ReminderService reminderService;

    @Autowired
    public void setReminderService(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("reminders", reminderService.listAllReminders());
        return "doctor/reminder";
    }

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("reminder/{id}")
    public String showReminder(@PathVariable Long id, Model model) {
        model.addAttribute("reminder", reminderService.getReminderById(id));
        return "doctor/remindshow";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("reminder/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("reminder", reminderService.getReminderById(id));
        return "doctor/addReminder";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("reminder/new")
    public String newReminder(Model model) {
        model.addAttribute("reminder", new Reminder());
        return "doctor/addReminder";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "reminder", method = RequestMethod.POST)
    public String saveReminder(Reminder reminder) {
        reminderService.saveReminder(reminder);
        return "redirect:/reminders";
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("reminder/delete/{id}")
    public String delete(@PathVariable Long id) {
        reminderService.deleteReminder(id);
        return "redirect:/reminders";
    }

}
