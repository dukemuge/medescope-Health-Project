package com.example.demo.repository.clerk;

import com.example.demo.models.clerk.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardbRepository extends CrudRepository<Wardb, Long> {
}
