package com.saggy.Train.repo;

import com.saggy.Train.entity.TrainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrainScheduleRepository extends JpaRepository<TrainSchedule,Long> {
    //this is called jpa repo query
    List<TrainSchedule> findBySource_StationCodeAndDestination_StationCode(String sourceCode,String destinationCode);
    List<TrainSchedule> findBySource_StationNameAndDestination_StationName(String sourceName,String destinationName);
}
