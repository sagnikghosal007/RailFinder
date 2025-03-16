package com.saggy.Train.controller;


import com.saggy.Train.entity.TrainSchedule;
import com.saggy.Train.service.TrainSearchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
@CrossOrigin
public class TrainSearchController {
    TrainSearchService trainsearchService;
    private TrainSearchController(TrainSearchService trainsearchService){
        this.trainsearchService=trainsearchService;
    }
    @GetMapping("/by-code")
    public List<TrainSchedule> findTrainByStationCode(@RequestParam String sourceCode,
                                                      @RequestParam String destinationCode){
        return trainsearchService.findTrainByStationCode(sourceCode.toUpperCase(),destinationCode.toUpperCase());
    }
    @GetMapping("/by-name")
    public List<TrainSchedule> findTrainByStationName(@RequestParam String sourceName,
                                                      @RequestParam String destinationName){
        return trainsearchService.findTrainByStationName(sourceName.toUpperCase(),destinationName.toUpperCase());
    }
}
