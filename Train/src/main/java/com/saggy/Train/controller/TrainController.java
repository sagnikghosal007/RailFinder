package com.saggy.Train.controller;


import com.saggy.Train.entity.Train;
import com.saggy.Train.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {


    //ekta service jehuto tai r autowired annotationb lagabo na
    private TrainService trainService;

    //constructor autowiring
    public TrainController(TrainService trainService){
        this.trainService=trainService;
    }

    @GetMapping
    public List<Train> get5AllTrains(){
        return  trainService.getAllTrains();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train){
        return trainService.addTrain(train);
    }

    @GetMapping("/test")
    public void test(){

    }
}
