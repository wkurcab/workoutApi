package com.kurcab.crud.drills.controller;

import com.kurcab.crud.drills.domain.DrillDto;
import com.kurcab.crud.drills.mapper.DrillMapper;
import com.kurcab.crud.drills.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by Wojciech Kurcab rr151459 on 2020-12-22
 */

@RestController
@RequestMapping("/v1/drill")
public class DrillController {
    @Autowired
    private DbService dbService;
    @Autowired
    private DrillMapper drillMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getDrills")
    public List<DrillDto> getDrills() {
        return drillMapper.mapToDrillDtoList(dbService.getAllDrills());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getDrill")
    public DrillDto getDrill(@RequestParam Long id) throws DrillNotFoundException {
        return drillMapper.mapToDrillDto(dbService.getDrill(id).orElseThrow(DrillNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteDrill")
    public void deleteDrill(Long id) {
        dbService.deleteDrill(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateDrill")
    public DrillDto updateDrill(@RequestBody DrillDto drillDto) {
        return drillMapper.mapToDrillDto(dbService.saveDrill(drillMapper.mapToDrill(drillDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createDrill", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createDrill(@RequestBody DrillDto drillDto) {
        dbService.saveDrill(drillMapper.mapToDrill(drillDto));
    }
}
