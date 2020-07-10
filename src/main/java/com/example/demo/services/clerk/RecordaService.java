package com.example.demo.services.clerk;

import com.example.demo.models.clerk.*;
import com.example.demo.repository.clerk.RecordaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * record service implement.
 */
@Service
public class RecordaService {
    @Autowired

    private RecordaRepository recordaRepository;

    public void setRecordaRepository(RecordaRepository recordaRepository) {
        this.recordaRepository = recordaRepository;
    }

    public ArrayList<Recorda> findAll() {
        return (ArrayList<Recorda>) recordaRepository.findAll();
    }

    public Recorda create(Recorda recorda) {
        return recordaRepository.save(recorda);
    }

    public Recorda update(Recorda recorda) {
        return recordaRepository.save(recorda);
    }

    public Recorda findById(Long id) {
        return recordaRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        recordaRepository.deleteById(idToDelete);
    }

    public void deleteRecorda(Recorda recorda) {
        recordaRepository.delete(recorda);
    }

}
