package com.example.demo.models.patient;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Feedback {
  @GeneratedValue
  @Id
  private Long id;

  @Enumerated(value = EnumType.STRING)
  private Rate rate;

  private String improvement;

  private String suggestion;

  private String report;

  // Constructors
  public Feedback() {

  }

  public Feedback(Long id, Rate rate, String improvement, String suggestion, String report) {
    this.id = id;
    this.rate = rate;
    this.improvement = improvement;
    this.suggestion = suggestion;
    this.report = report;

  }

  // Accessor Methods
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Rate getRate() {
    return this.rate;
  }

  public void setRate(Rate rate) {
    this.rate = rate;
  }

  public String getImprovement() {
    return this.improvement;
  }

  public void setImprovement(String improvement) {
    this.improvement = improvement;
  }

  public String getSuggestion() {
    return this.suggestion;
  }

  public void setSuggestion(String suggestion) {
    this.suggestion = suggestion;
  }

  public String getReport() {
    return this.report;
  }

  public void setReport(String report) {
    this.report = report;
  }

}