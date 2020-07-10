package com.example.demo.repository.patient;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.patient.Feedback;

public interface FeedbackRepository extends  CrudRepository<Feedback, Long> {
}
