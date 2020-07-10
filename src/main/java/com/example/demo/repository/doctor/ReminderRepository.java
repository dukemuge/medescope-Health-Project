package com.example.demo.repository.doctor;

import com.example.demo.models.doctor.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepository extends CrudRepository<Reminder, Long> {
}
