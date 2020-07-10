package com.example.demo.repository.admin;

import com.example.demo.models.admin.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Long> {
}
