package com.example.demo.models.patient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;

@Entity
public class Profile {

	 @GeneratedValue
	  @Id
    
    private Long id;

    @NotNull(message = "Indicate your full names")

    private String fullname;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dob;

    private String mobileno;

    private String idno;

    private String gender;

    private String residence;

    private String address;

    private String nok;

    private String relationship;

    // Constructors
    public Profile() {

    }

    public Profile(Long id, String fullname, LocalDate dob, String mobileno, String idno, String gender, String residence,
            String address, String nok, String relationship) {
        this.id = id;
        this.fullname = fullname;
        this.dob = dob;
        this.mobileno = mobileno;
        this.idno = idno;
        this.gender = gender;
        this.residence = residence;
        this.address = address;
        this.nok = nok;
        this.relationship = relationship;

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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNok() {
        return nok;
    }

    public void setNok(String nok) {
        this.nok = nok;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

}