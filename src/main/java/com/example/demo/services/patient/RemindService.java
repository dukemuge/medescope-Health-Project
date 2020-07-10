package com.example.demo.services.patient;

import com.example.demo.models.patient.Remind;

public interface RemindService {

    Iterable<Remind> listAllReminds();

    Remind getRemindById(Long id);

    Remind saveRemind(Remind remind);

    void deleteRemind(Long id);

}
