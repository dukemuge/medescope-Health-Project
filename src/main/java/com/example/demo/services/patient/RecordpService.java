package com.example.demo.services.patient;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.patient.Donation;
import com.example.demo.models.patient.Recordp;
import com.example.demo.repository.patient.DonationRepository;
import com.example.demo.repository.patient.RecordpRepository;

@Service
public class RecordpService {
	@Autowired

    private RecordpRepository recordpRepository;

    public void setRecordpRepository(RecordpRepository recordpRepository) {
        this.recordpRepository = recordpRepository;
    }

    public ArrayList<Recordp> findAll() {
        return (ArrayList<Recordp>) recordpRepository.findAll();
    }

    public Recordp create(Recordp recordp) {
        return recordpRepository.save(recordp);
    }

    public Recordp update(Recordp recordp) {
        return recordpRepository.save(recordp);
    }

    public Recordp findById(Long id) {
        return recordpRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        recordpRepository.deleteById(idToDelete);
    }

    public void deleteRecordp(Recordp recordp) {
        recordpRepository.delete(recordp);
    }

}
