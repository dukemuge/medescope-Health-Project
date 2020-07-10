package com.example.demo.services.admin;

import com.example.demo.models.admin.*;
import com.example.demo.repository.admin.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * record service implement.
 */
@Service
public class StaffService {

    private StaffRepository staffRepository;

    @Autowired
    public void setStaffRepository(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public ArrayList<Staff> findAll() {
        return (ArrayList<Staff>) staffRepository.findAll();
    }

    public Staff create(Staff staff) {
        return staffRepository.save(staff);
    }

    public Staff update(Staff staff) {
        return staffRepository.save(staff);
    }

    public Staff findById(Long id) {
        return staffRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        staffRepository.deleteById(idToDelete);
    }

    public void deleteStaff(Staff staff) {
        staffRepository.delete(staff);
    }

}
