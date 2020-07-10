package com.example.demo.services.patient;

import com.example.demo.models.patient.*;
import com.example.demo.repository.patient.ProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository profileRepository;

    @Autowired
    public void setProfileRepository(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Iterable<Profile> listAllProfiles() {
        return profileRepository.findAll();
    }

    @Override
    public Profile getProfileById(Long id) {
        return profileRepository.findById(id).get();
    }

    @Override
    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }

}
