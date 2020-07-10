package com.example.demo.repository.patient;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.patient.Donation;

public interface DonationRepository extends CrudRepository<Donation, Long> {

}
