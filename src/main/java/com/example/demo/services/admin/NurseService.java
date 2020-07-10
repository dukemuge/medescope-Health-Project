package com.example.demo.services.admin;

import com.example.demo.models.admin.*;
import com.example.demo.repository.admin.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * record service implement.
 */
@Service
public class NurseService {

    private NurseRepository nurseRepository;

    @Autowired
    public void setNurseRepository(NurseRepository nurseRepository) {
        this.nurseRepository = nurseRepository;
    }

    public ArrayList<Nurse> findAll() {
        return (ArrayList<Nurse>) nurseRepository.findAll();
    }

    public Nurse create(Nurse nurse) {
        return nurseRepository.save(nurse);
    }

    public Nurse update(Nurse nurse) {
        return nurseRepository.save(nurse);
    }

    public Nurse findById(Long id) {
        return nurseRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        nurseRepository.deleteById(idToDelete);
    }

    public void deleteNurse(Nurse nurse) {
        nurseRepository.delete(nurse);
    }

}
