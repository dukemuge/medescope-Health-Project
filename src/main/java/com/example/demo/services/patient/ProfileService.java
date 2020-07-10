package com.example.demo.services.patient;

import com.example.demo.models.patient.Profile;

public interface ProfileService {

    Iterable<Profile> listAllProfiles();

    Profile getProfileById(Long id);

    Profile saveProfile(Profile profile);

    void deleteProfile(Long id);

}
