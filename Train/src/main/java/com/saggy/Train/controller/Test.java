package com.saggy.Train.controller;


import com.saggy.Train.entity.Stattion;
import com.saggy.Train.entity.Train;
import com.saggy.Train.entity.TrainSchedule;
import com.saggy.Train.repo.StationRepository;
import com.saggy.Train.repo.TrainRepository;
import com.saggy.Train.repo.TrainScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    StationRepository stationRepository;

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    TrainScheduleRepository trainScheduleRepository;

    @GetMapping
    public void test()
    {
        Stattion delhi=new Stattion(null,"New Delhi","NDLS");
        Stattion mumbai=new Stattion(null,"Mumbai central","CST");
        Stattion kolkata=new Stattion(null,"Kolkata","KOAA");
        Stattion chennai=new Stattion(null,"Chennai Central","MAS");

        stationRepository.saveAll(List.of(delhi,mumbai,kolkata,chennai));

        Train rajdhani = new Train(null,"Rajdhani Express","12306",null);
        Train durunto = new Train(null,"Durunto Express","12260",null);
        Train shatabdi = new Train(null,"Shatabdi Express","12043",null);

        trainRepository.saveAll(List.of(rajdhani,durunto,shatabdi));


        TrainSchedule sc1=new TrainSchedule(null,rajdhani,delhi,mumbai,"06:00","14:00");
        TrainSchedule sc2=new TrainSchedule(null,durunto,mumbai,kolkata,"08:00","21:00");
        TrainSchedule sc3=new TrainSchedule(null,shatabdi,kolkata,chennai,"11:30","19:00");

        trainScheduleRepository.saveAll(List.of(sc1,sc2,sc3));

        System.out.println("Data inserted in database...");

    }
}
