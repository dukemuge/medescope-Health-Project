package com.example.demo.services.doctor;

import com.example.demo.models.doctor.*;
import com.example.demo.repository.doctor.ReminderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class ReminderServiceImpl implements ReminderService {

    private ReminderRepository reminderRepository;

    @Autowired
    public void setReminderRepository(ReminderRepository reminderRepository) {
        this.reminderRepository = reminderRepository;
    }

    @Override
    public Iterable<Reminder> listAllReminders() {
        return reminderRepository.findAll();
    }

    @Override
    public Reminder getReminderById(Long id) {
        return reminderRepository.findById(id).get();
    }

    @Override
    public Reminder saveReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    @Override
    public void deleteReminder(Long id) {
        reminderRepository.deleteById(id);
    }

}
