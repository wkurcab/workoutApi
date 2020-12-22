package com.kurcab.crud.drills.repository;

import com.kurcab.crud.drills.domain.Drill;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Wojciech Kurcab rr151459 on 2020-12-22
 */

public interface DrillRepository extends CrudRepository<Drill, Long> {
    @Override
    List<Drill> findAll();

    @Override
    Drill save (Drill drill);

    @Override
    Optional<Drill> findById(Long id);

    @Override
    void deleteById(Long id);
}
