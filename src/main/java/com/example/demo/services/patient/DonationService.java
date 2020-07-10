package com.example.demo.services.patient;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.patient.Donation;
import com.example.demo.repository.patient.DonationRepository;

@Service
public class DonationService {
	@Autowired

    private DonationRepository donationRepository;

    public void setDonationRepository(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public ArrayList<Donation> findAll() {
        return (ArrayList<Donation>) donationRepository.findAll();
    }

    public Donation create(Donation donation) {
        return donationRepository.save(donation);
    }

    public Donation update(Donation donation) {
        return donationRepository.save(donation);
    }

    public Donation findById(Long id) {
        return donationRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        donationRepository.deleteById(idToDelete);
    }

    public void deleteDonation(Donation donation) {
        donationRepository.delete(donation);
    }

}
