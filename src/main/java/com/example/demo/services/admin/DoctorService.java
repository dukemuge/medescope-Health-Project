package com.example.demo.services.admin;

import com.example.demo.models.admin.*;
import com.example.demo.repository.admin.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * record service implement.
 */
@Service
public class DoctorService {

    private DoctorRepository doctorRepository;

    @Autowired
    public void setDoctorRepository(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public ArrayList<Doctor> findAll() {
        return (ArrayList<Doctor>) doctorRepository.findAll();
    }

    public Doctor create(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor update(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor findById(Long id) {
        return doctorRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        doctorRepository.deleteById(idToDelete);
    }

    public void deleteDoctor(Doctor doctor) {
        doctorRepository.delete(doctor);
    }

}
