package com.kurcab.crud.drills.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Wojciech Kurcab rr151459 on 2020-12-22
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "DRILLS")
public class Drill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DRILLNAME")
    private String drillName;

    @Column(name = "DRILLDESCRIPTION")
    private String drillDescription;

    @Column(name = "DRILLLINK")
    private String drillLink;

//    public Drill(Long id, String drillName, String drillDescription, String drillLink) {
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
