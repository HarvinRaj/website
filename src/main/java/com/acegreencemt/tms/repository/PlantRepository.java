package com.acegreencemt.tms.repository;

import com.acegreencemt.tms.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;


//Only searches unique values in DB, JPA standards.
public interface PlantRepository extends JpaRepository<Plant, Long> {

    Plant findByPlantName(String plantName);

}
