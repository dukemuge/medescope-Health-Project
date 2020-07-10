package com.example.demo.services.clerk;

import com.example.demo.models.clerk.*;
import com.example.demo.repository.clerk.WarddRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * ward service implement.
 */
@Service
public class WarddService {
    @Autowired

    private WarddRepository warddRepository;

    public void setWarddRepository(WarddRepository warddRepository) {
        this.warddRepository = warddRepository;
    }

    public ArrayList<Wardd> findAll() {
        return (ArrayList<Wardd>) warddRepository.findAll();
    }

    public Wardd create(Wardd wardd) {
        return warddRepository.save(wardd);
    }

    public Wardd update(Wardd wardd) {
        return warddRepository.save(wardd);
    }

    public Wardd findById(Long id) {
        return warddRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        warddRepository.deleteById(idToDelete);
    }

    public void deleteWardd(Wardd wardd) {
        warddRepository.delete(wardd);
    }

}
