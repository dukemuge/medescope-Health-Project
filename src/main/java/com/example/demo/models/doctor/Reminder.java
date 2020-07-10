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
public class Reminder {

	@GeneratedValue
	@Id
	private Long id;
	@NotNull(message = "Date of event required")
	  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)

	private LocalDate dor;

	@Enumerated(value = EnumType.STRING)
	private Reminderc reminderc;

	private String reason;

	public Reminder(Long id, LocalDate dor, Reminderc reminderc, String reason) {
		this.id = id;
		this.dor = dor;
		this.reminderc = reminderc;
		this.reason = reason;
	}
	public Reminder() {}

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

	public Reminderc getReminderc() {
		return this.reminderc;
	}

	public void setReminderc(Reminderc reminderc) {
		this.reminderc = reminderc;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}