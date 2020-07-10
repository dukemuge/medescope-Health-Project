package com.example.demo.repository.admin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.admin.*;


@Repository
public interface LabtechRepository extends CrudRepository<Labtech, Long> {
}




