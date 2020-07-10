package com.example.demo.services.doctor;

import com.example.demo.models.doctor.Reminder;

public interface ReminderService {

    Iterable<Reminder> listAllReminders();

    Reminder getReminderById(Long id);

    Reminder saveReminder(Reminder reminder);

    void deleteReminder(Long id);

}
