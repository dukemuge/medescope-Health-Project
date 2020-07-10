package com.example.demo.models.patient;

import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Request {

  // Properties
  @Id
  private Long id;
  @NotNull(message = "Indicate date of activity")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateofreq;

  private String name;

  private String phoneno;

  private String emailp;

  // Constructors
  public Request() {

  }

  public Request(Long id, LocalDate dateofreq, String name, String phoneno, String emailp) {
    this.id = id;
    this.dateofreq = dateofreq;
    this.name = name;
    this.phoneno = phoneno;
    this.emailp = emailp;
  }

  // Accessor Methods
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getDateofreq() {
    return this.dateofreq;
  }

  public void setDateofreq(LocalDate dateofreq) {
    this.dateofreq = dateofreq;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneno() {
    return this.phoneno;
  }

  public void setPhoneno(String phoneno) {
    this.phoneno = phoneno;
  }

  public String getEmailp() {
    return this.emailp;
  }

  public void setEmailp(String emailp) {
    this.emailp = emailp;
  }

}