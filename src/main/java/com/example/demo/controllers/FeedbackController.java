package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.models.patient.Feedback;
import com.example.demo.services.patient.FeedbackService;

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
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @Autowired
    public void setFeedbackService(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping("/sentfeedback")
    public String showFeedback() {
        return "patient/sentfeedback";
    }

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/feedbacks", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("feedbacks", feedbackService.listAllFeedbacks());
        return "admin/feedback";
    }

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("feedback/{id}")
    public String showFeedback(@PathVariable Long id, Model model) {
        model.addAttribute("feedback", feedbackService.getFeedbackById(id));
        return "admin/feedbackshow";
    }

    // Afficher le formulaire de modification du Product
    @RequestMapping("feedback/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("feedback", feedbackService.getFeedbackById(id));
        return "patient/addFeedback";
    }

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("feedback/new")
    public String newFeedback(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "patient/addFeedback";
    }

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "feedback", method = RequestMethod.POST)
    public String saveFeedback(Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return "redirect:/sentfeedback";
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("feedback/delete/{id}")
    public String delete(@PathVariable Long id) {
        feedbackService.deleteFeedback(id);
        return "redirect:/feedbacks";
    }

}