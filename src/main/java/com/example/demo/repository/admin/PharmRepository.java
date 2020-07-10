package com.example.demo.repository.admin;

import com.example.demo.models.admin.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmRepository extends CrudRepository<Pharm, Long> {
}
