package com.example.demo.services.patient;

import com.example.demo.models.patient.*;
import com.example.demo.repository.patient.FeedbackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {

    private FeedbackRepository feedbackRepository;

    @Autowired
    public void setFeedbackRepository(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public Iterable<Feedback> listAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @Override
    public Feedback getFeedbackById(Long id) {
        return feedbackRepository.findById(id).get();
    }

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public void deleteFeedback(Long id) {
        feedbackRepository.deleteById(id);
    }

}
