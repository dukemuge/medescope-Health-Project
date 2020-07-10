package com.example.demo.models.clerk;

import java.util.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity


public class Wardb {

  @GeneratedValue
  @Id
  private Long id;

  private Date doa;

  private String name;
  private String room;

  private String gender;
  private String phoneno;

  private String reason;

  private Date dod;

public Wardb(Long id, Date doa, String name, String room, String gender, String phoneno, String reason, Date dod) {
	
	this.id = id;
	this.doa = doa;
	this.name = name;
	this.room = room;
	this.gender = gender;
	this.phoneno = phoneno;
	this.reason = reason;
	this.dod = dod;
}
public Wardb() {}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Date getDoa() {
	return doa;
}

public void setDoa(Date doa) {
	this.doa = doa;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRoom() {
	return room;
}

public void setRoom(String room) {
	this.room = room;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}

public Date getDod() {
	return dod;
}

public void setDod(Date dod) {
	this.dod = dod;
}
@Override
public String toString() {
	return "Wardb [id=" + id + ", doa=" + doa + ", name=" + name + ", room=" + room + ", gender=" + gender
			+ ", phoneno=" + phoneno + ", reason=" + reason + ", dod=" + dod + "]";
}


  
  

}