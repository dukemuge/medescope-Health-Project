package com.example.demo.controllers;

import com.example.demo.models.patient.Remind;
import com.example.demo.services.patient.RemindService;
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
public class RemindController {

    private RemindService remindService;

    @Autowired
    public void setRemindService(RemindService remindService) {
        this.remindService = remindService;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/reminds", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("reminds", remindService.listAllReminds());
        return "patient/remind";
    }

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("remind/{id}")
    public String showRemind(@PathVariable Long id, Model model) {
        model.addAttribute("remind", remindService.getRemindById(id));
        return "patient/remindshow";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("remind/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("remind", remindService.getRemindById(id));
        return "patient/addRemind";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("remind/new")
    public String newRemind(Model model) {
        model.addAttribute("remind", new Remind());
        return "patient/addRemind";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "remind", method = RequestMethod.POST)
    public String saveRemind(Remind remind) {
        remindService.saveRemind(remind);
        return "redirect:/reminds";
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("remind/delete/{id}")
    public String delete(@PathVariable Long id) {
        remindService.deleteRemind(id);
        return "redirect:/reminds";
    }

}
