package com.kurcab.crud.drills.mapper;

import com.kurcab.crud.drills.domain.Drill;
import com.kurcab.crud.drills.domain.DrillDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Wojciech Kurcab rr151459 on 2020-12-22
 */

@Component
public class DrillMapper {
    public Drill mapToDrill(final DrillDto drillDto) {
        return new Drill(
                drillDto.getId(),
                drillDto.getDrillName(),
                drillDto.getDrillDescription(),
                drillDto.getDrillLink());
    }

    public DrillDto mapToDrillDto(final Drill drill) {
        return new DrillDto(
                drill.getId(),
                drill.getDrillName(),
                drill.getDrillDescription(),
                drill.getDrillLink());
    }

    public List<DrillDto> mapToDrillDtoList(final List<Drill> drillList) {
        return drillList.stream()
                .map(d -> new DrillDto(d.getId(), d.getDrillName(), d.getDrillDescription(), d.getDrillLink()))
                .collect(Collectors.toList());
    }
}
