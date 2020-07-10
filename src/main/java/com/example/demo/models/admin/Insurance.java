package com.example.demo.models.admin;

import java.util.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import  javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity



public class Insurance{

  @GeneratedValue
  @Id
  private Long id;

  
  @NotBlank(message = "Indicate name of insurance")
  private String name;
  @NotBlank(message = "indicate services supported")


  private String services;
   public Insurance() {
	   
   }
public Insurance(Long id, String name, String services) {
	
	this.id = id;
	this.name = name;
	this.services = services;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getServices() {
	return services;
}
public void setServices(String services) {
	this.services = services;
}


  

}