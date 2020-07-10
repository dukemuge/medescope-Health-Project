package com.example.demo.repository.labtech;

import com.example.demo.models.labtech.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderlRepository extends CrudRepository<Reminderl, Long> {
}




