package com.saggy.Train.entity;

import jakarta.persistence.*;


@Entity
public class TrainSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

    @ManyToOne
    @JoinColumn(name = "source_stattion_id")
    private Stattion source;
    //foreign key ta samne thake for both souce and destinbatiomn
    @ManyToOne
    @JoinColumn(name = "destination_stattion_id")
    private Stattion destination;


    private String departure_time;

    private String arrival_time;
    public TrainSchedule()
    {

    }

    public TrainSchedule(Long id, Train train, Stattion source, Stattion destination, String departure_time, String arrival_time) {
        this.id = id;
        this.train = train;
        this.source = source;
        this.destination = destination;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public Stattion getDestination() {
        return destination;
    }

    public void setDestination(Stattion destination) {
        this.destination = destination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Stattion getSource() {
        return source;
    }

    public void setSource(Stattion source) {
        this.source = source;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
