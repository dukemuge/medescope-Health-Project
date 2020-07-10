package com.example.demo.services.admin;

import com.example.demo.models.admin.*;
import com.example.demo.repository.admin.PharmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * record service implement.
 */
@Service
public class PharmService {

    private PharmRepository pharmRepository;

    @Autowired
    public void setPharmRepository(PharmRepository pharmRepository) {
        this.pharmRepository = pharmRepository;
    }

    public ArrayList<Pharm> findAll() {
        return (ArrayList<Pharm>) pharmRepository.findAll();
    }

    public Pharm create(Pharm pharm) {
        return pharmRepository.save(pharm);
    }

    public Pharm update(Pharm pharm) {
        return pharmRepository.save(pharm);
    }

    public Pharm findById(Long id) {
        return pharmRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        pharmRepository.deleteById(idToDelete);
    }

    public void deletePharm(Pharm pharm) {
        pharmRepository.delete(pharm);
    }

}
