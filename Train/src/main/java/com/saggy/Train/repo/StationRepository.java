package com.saggy.Train.repo;

import com.saggy.Train.entity.Stattion;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StationRepository extends JpaRepository<Stattion,Long> {
}
