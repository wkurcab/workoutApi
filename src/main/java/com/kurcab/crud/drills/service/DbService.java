package com.kurcab.crud.drills.service;

import com.kurcab.crud.drills.domain.Drill;
import com.kurcab.crud.drills.repository.DrillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Wojciech Kurcab rr151459 on 2020-12-22
 */

@Service
public class DbService {
    @Autowired
    private DrillRepository repository;

    public List<Drill> getAllDrills() {
        return repository.findAll();
    }

    public Optional<Drill> getDrill(final Long id) {
        return repository.findById(id);
    }

    public Drill saveDrill(final Drill drill) {
        return repository.save(drill);
    }

    public void deleteDrill(final Long id) {
        repository.deleteById(id);
    }
}
