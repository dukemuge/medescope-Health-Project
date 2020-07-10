package com.example.demo.controllers;

import com.example.demo.models.doctor.Profiled;
import com.example.demo.services.doctor.ProfiledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Product controller.
 */
@Controller
public class ProfiledController {

    private ProfiledService profiledService;

    @Autowired
    public void setProfiledService(ProfiledService profiledService) {
        this.profiledService = profiledService;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/profileds", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("profileds", profiledService.listAllProfileds());
        return "doctor/profiled";
    }

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("profiled/{id}")
    public String showProfiled(@PathVariable Long id, Model model) {
        model.addAttribute("profiled", profiledService.getProfiledById(id));
        return "doctor/addProfiled";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("profiled/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("profiled", profiledService.getProfiledById(id));
        return "doctor/addProfiled";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("profiled/new")
    public String newProfiled(Model model) {
        model.addAttribute("profiled", new Profiled());
        return "doctor/addProfiled";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "profiled", method = RequestMethod.POST)
    public String saveProfiled(Profiled profiled) {
        profiledService.saveProfiled(profiled);
        return "redirect:/profileds";
    }
    @GetMapping("/enrollpersonald")
    public String sentProfiled() {
        return "doctor/addPersonald";
    }


    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("profiled/delete/{id}")
    public String delete(@PathVariable Long id) {
        profiledService.deleteProfiled(id);
        return "redirect:/enrollpersonald";
    }

}
