package com.example.demo.services.doctor;

import com.example.demo.models.doctor.*;
import com.example.demo.repository.doctor.ProfiledRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class ProfiledServiceImpl implements ProfiledService {

    private ProfiledRepository profiledRepository;

    @Autowired
    public void setProfiledRepository(ProfiledRepository profiledRepository) {
        this.profiledRepository = profiledRepository;
    }

    @Override
    public Iterable<Profiled> listAllProfileds() {
        return profiledRepository.findAll();
    }

    @Override
    public Profiled getProfiledById(Long id) {
        return profiledRepository.findById(id).get();
    }

    @Override
    public Profiled saveProfiled(Profiled profiled) {
        return profiledRepository.save(profiled);
    }

    @Override
    public void deleteProfiled(Long id) {
        profiledRepository.deleteById(id);
    }

}
