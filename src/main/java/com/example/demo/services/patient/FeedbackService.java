package com.example.demo.services.patient;

import com.example.demo.models.patient.Feedback;

public interface FeedbackService {

    Iterable<Feedback> listAllFeedbacks();

    Feedback getFeedbackById(Long id);

    Feedback saveFeedback(Feedback feedback);

    void deleteFeedback(Long id);

}
