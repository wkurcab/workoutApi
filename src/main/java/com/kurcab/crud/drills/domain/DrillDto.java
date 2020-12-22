package com.kurcab.crud.drills.domain;

import lombok.Getter;
import lombok.AllArgsConstructor;


/**
 * Created by Wojciech Kurcab rr151459 on 2020-12-22
 */

@Getter
@AllArgsConstructor
public class DrillDto {
    private Long id;
    private String drillName;
    private String drillDescription;
    private String drillLink;

//    public DrillDto(Long id, String drillName, String drillDescription, String drillLink) {
//        this.id = id;
//        this.drillName = drillName;
//        this.drillDescription = drillDescription;
//        this.drillLink = drillLink;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getDrillName() {
//        return drillName;
//    }
//
//    public String getDrillDescription() {
//        return drillDescription;
//    }
//
//    public String getDrillLink() {
//        return drillLink;
//    }
}
