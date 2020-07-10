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

public class Remind {

  @GeneratedValue
  @Id
  private Long id;
  @NotNull(message = "Indicate date of activity")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dor;

  @Enumerated(value = EnumType.STRING)
  private Remindc remindc;
  private String reason;

  public Remind(Long id, LocalDate dor, Remindc remindc, String reason) {

	this.id = id;
	this.dor = dor;
	this.remindc = remindc;
	this.reason = reason;
}
  public Remind() {}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public LocalDate getDor() {
	return dor;
}
public void setDor(LocalDate dor) {
	this.dor = dor;
}
public Remindc getRemindc() {
	return remindc;
}
public void setRemindc(Remindc remindc) {
	this.remindc = remindc;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
  
  



}