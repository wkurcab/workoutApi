package com.kurcab.crud.drills;

import com.kurcab.crud.drills.domain.Drill;
import com.kurcab.crud.drills.repository.DrillRepository;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Wojciech Kurcab rr151459 on 2020-12-22
 */

@Route
public class DrillShowGui extends VerticalLayout {
    private DrillRepository drillRepository;

    @Autowired
    public DrillShowGui(DrillRepository drillRepository) {
        this.drillRepository = drillRepository;

        Grid<Drill> drillGrid = new Grid<>(Drill.class);
        drillGrid.setItems(drillRepository.findAll());

        add(drillGrid);
    }
}
