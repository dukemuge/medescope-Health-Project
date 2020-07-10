package com.example.demo.services.admin;

import com.example.demo.models.admin.*;
import com.example.demo.repository.admin.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * record service implement.
 */
@Service
public class InsuranceService {
    @Autowired

    private InsuranceRepository insuranceRepository;

    public void setInsuranceRepository(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    public ArrayList<Insurance> findAll() {
        return (ArrayList<Insurance>) insuranceRepository.findAll();
    }

    public Insurance create(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    public Insurance update(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    public Insurance findById(Long id) {
        return insuranceRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        insuranceRepository.deleteById(idToDelete);
    }

    public void deleteInsurance(Insurance insurance) {
        insuranceRepository.delete(insurance);
    }

}
