package com.example.demo.services.clerk;

import com.example.demo.models.clerk.*;
import com.example.demo.repository.clerk.WardbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * ward service implement.
 */
@Service
public class WardbService {
    @Autowired

    private WardbRepository wardbRepository;

    public void setWardbRepository(WardbRepository wardbRepository) {
        this.wardbRepository = wardbRepository;
    }

    public ArrayList<Wardb> findAll() {
        return (ArrayList<Wardb>) wardbRepository.findAll();
    }

    public Wardb create(Wardb wardb) {
        return wardbRepository.save(wardb);
    }

    public Wardb update(Wardb wardb) {
        return wardbRepository.save(wardb);
    }

    public Wardb findById(Long id) {
        return wardbRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        wardbRepository.deleteById(idToDelete);
    }

    public void deleteWardb(Wardb wardb) {
        wardbRepository.delete(wardb);
    }

}
