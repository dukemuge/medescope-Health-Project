package com.example.demo.services.patient;

import com.example.demo.models.patient.*;
import com.example.demo.repository.patient.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * record service implement.
 */
@Service
public class RequestService {
    @Autowired

    private RequestRepository requestRepository;

    public void setRequestRepository(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public ArrayList<Request> findAll() {
        return (ArrayList<Request>) requestRepository.findAll();
    }

    public Request create(Request request) {
        return requestRepository.save(request);
    }

    public Request update(Request request) {
        return requestRepository.save(request);
    }

    public Request findById(Long id) {
        return requestRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        requestRepository.deleteById(idToDelete);
    }

    public void deleteRequest(Request request) {
        requestRepository.delete(request);
    }

}
