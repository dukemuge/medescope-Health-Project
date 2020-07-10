package com.example.demo.models.doctor;

import java.util.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity

public class Profiled {

    @GeneratedValue
  @Id
    private Long id;
    private String fullname;

    private String mobileno;

    private String idno;

    private String registration;

    private String gender;

    private String background;

    private String speciality;

    private String department;

    // Constructors
    public Profiled() {

    }

    public Profiled(Long id, String fullname, String mobileno, String idno, String registration, String gender,
            String background, String speciality, String department) {
        this.id = id;
        this.fullname = fullname;
        this.mobileno = mobileno;
        this.idno = idno;
        this.registration = registration;
        this.gender = gender;
        this.background = background;
        this.speciality = speciality;
        this.department = department;
    }

    // Accessor Methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}