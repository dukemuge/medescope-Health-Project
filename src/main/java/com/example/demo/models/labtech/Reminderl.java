package com.example.demo.models.labtech;

import java.util.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity


public class Reminderl {

  @GeneratedValue
  @Id
  private Long id;

  private Date dov;


  private String reason;


public Reminderl(Long id, Date dov, String reason) {
	super();
	this.id = id;
	this.dov = dov;
	this.reason = reason;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public Date getDov() {
	return dov;
}


public void setDov(Date dov) {
	this.dov = dov;
}


public String getReason() {
	return reason;
}


public void setReason(String reason) {
	this.reason = reason;
}
  

}