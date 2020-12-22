package com.kurcab.crud.drills;

import com.kurcab.crud.drills.domain.Drill;
import com.kurcab.crud.drills.repository.DrillRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Wojciech Kurcab rr151459 on 2020-12-22
 */

@Route
public class DrillGui extends VerticalLayout {

    private DrillRepository drillRepository;

    private TextField textFieldName;
    private TextArea textAreaDescription;
    private TextField textFieldLink;
    private Button button;

    @Autowired
    public DrillGui(DrillRepository drillRepository) {
        this.drillRepository = drillRepository;

        textFieldName = new TextField("Drill Name");
        textAreaDescription = new TextArea("Drill description");
        textFieldLink = new TextField("Drill Link");
        button = new Button("Add drill");

        button.addClickListener(clickEvent -> addDrill());

        add(textFieldName, textAreaDescription, textFieldLink, button);
    }

    private void addDrill() {
        Drill drill = new Drill();
        drill.setDrillName(textFieldName.getValue());
        drill.setDrillDescription(textAreaDescription.getValue());
        drill.setDrillLink(textFieldLink.getValue());
        drillRepository.save(drill);
        Notification notification = new Notification("Drill added!", 3000);
        notification.open();
    }
}
