package com.example.demo.services.doctor;

import com.example.demo.models.doctor.Profiled;

public interface ProfiledService {

    Iterable<Profiled> listAllProfileds();

    Profiled getProfiledById(Long id);

    Profiled saveProfiled(Profiled profiled);

    void deleteProfiled(Long id);

}
