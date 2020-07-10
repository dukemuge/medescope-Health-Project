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


@Entity


public class Recordp {

	@GeneratedValue
	@Id
	private Long id;
	@NotNull(message = "Indicate date of visit")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateofvisit;

	private String name;

	private String phoneno;

	private String symptoms;

	private String labfindings;

	private String medication;

	private String recommendation;

	public Recordp(Long id, LocalDate dateofvisit, String name, String phoneno, String symptoms, String labfindings,
			String medication, String recommendation) {

		this.id = id;
		this.dateofvisit = dateofvisit;
		this.name = name;
		this.phoneno = phoneno;
		this.symptoms = symptoms;
		this.labfindings = labfindings;
		this.medication = medication;
		this.recommendation = recommendation;
	}

	public Recordp() {
	}

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

}