package com.example.demo.controllers;

import com.example.demo.models.patient.Profile;
import com.example.demo.services.patient.ProfileService;
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
public class ProfileController {

    private ProfileService profileService;

    @Autowired
    public void setProfileService(ProfileService profileService) {
        this.profileService = profileService;
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("profiles", profileService.listAllProfiles());
        return "patient/profile";
    }

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("profile/{id}")
    public String showProfile(@PathVariable Long id, Model model) {
        model.addAttribute("profile", profileService.getProfileById(id));
        return "patient/showProfile";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("profile/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("profile", profileService.getProfileById(id));
        return "patient/addProfile";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("profile/new")
    public String newProfile(Model model) {
        model.addAttribute("profile", new Profile());
        return "patient/addProfile";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "profile", method = RequestMethod.POST)
    public String saveProfile(Profile profile) {
        profileService.saveProfile(profile);
        return "redirect:/profiles";
    }

    @GetMapping("/enrollpersonal")
    public String sentProfile() {
        return "patient/addPersonal";
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("profile/delete/{id}")
    public String delete(@PathVariable Long id) {
        profileService.deleteProfile(id);
        return "redirect:/enrollpersonal";
    }

}
