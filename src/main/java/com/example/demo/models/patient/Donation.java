package com.example.demo.models.patient;

import java.util.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;


@Entity
public class Donation {

  @GeneratedValue
  @Id
  private Long id;
  @NotNull(message = "Indicate your full names")

  private String fullname;
  @NotNull(message = "Date of donation required")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dod;
  @NotNull(message = "Indicate name of pledge")

  private String pledge;
  @NotNull(message = "Indicate the intended purpose of the pledge")

  private String purpose;

  @NotNull(message = "Indicate your phone no")
  private String phoneno;

  private String email;

  // Constructors
  public Donation() {

  }

  public Donation(Long id, String fullname, LocalDate dod, String pledge, String purpose, String phoneno,
      String email) {
    this.id = id;
    this.fullname = fullname;
    this.dod = dod;
    this.pledge = pledge;
    this.purpose = purpose;
    this.phoneno = phoneno;
    this.email = email;
  }

  // Accessor Methods
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFullname() {
    return this.fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public LocalDate getDod() {
    return this.dod;
  }

  public void setDod(LocalDate dod) {
    this.dod = dod;
  }

  public String getPledge() {
    return this.pledge;
  }

  public void setPledge(String pledge) {
    this.pledge = pledge;
  }

  public String getPurpose() {
    return this.purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public String getPhoneno() {
    return this.phoneno;
  }

  public void setPhoneno(String phoneno) {
    this.phoneno = phoneno;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}