package com.example.demo.models.doctor;

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

public class Record {

  @GeneratedValue
  @Id
  private Long id;
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)


  private LocalDate dateofvisit;

  private String name;

  private String phoneno;

  private String symptoms;

  private String labfindings;

  private String medication;

  private String recommendation;
  
  

public Record(Long id, LocalDate dateofvisit, String name, String phoneno, String symptoms, String labfindings,
		String medication, String recommendation) {
	super();
	this.id = id;
	this.dateofvisit = dateofvisit;
	this.name = name;
	this.phoneno = phoneno;
	this.symptoms = symptoms;
	this.labfindings = labfindings;
	this.medication = medication;
	this.recommendation = recommendation;
}

public Record() {}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public LocalDate getDateofvisit() {
	return dateofvisit;
}

public void setDateofvisit(LocalDate dateofvisit) {
	this.dateofvisit = dateofvisit;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public String getSymptoms() {
	return symptoms;
}

public void setSymptoms(String symptoms) {
	this.symptoms = symptoms;
}

public String getLabfindings() {
	return labfindings;
}

public void setLabfindings(String labfindings) {
	this.labfindings = labfindings;
}

public String getMedication() {
	return medication;
}

public void setMedication(String medication) {
	this.medication = medication;
}

public String getRecommendation() {
	return recommendation;
}

public void setRecommendation(String recommendation) {
	this.recommendation = recommendation;
}

@Override
public String toString() {
	return "Record [id=" + id + ", dateofvisit=" + dateofvisit + ", name=" + name + ", phoneno=" + phoneno
			+ ", symptoms=" + symptoms + ", labfindings=" + labfindings + ", medication=" + medication
			+ ", recommendation=" + recommendation + "]";
}

  
  

}