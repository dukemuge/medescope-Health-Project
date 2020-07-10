package com.example.demo.repository.patient;

import com.example.demo.models.patient.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
}




