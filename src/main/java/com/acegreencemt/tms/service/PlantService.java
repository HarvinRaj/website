package com.acegreencemt.tms.service;

import com.acegreencemt.tms.model.Plant;

import java.util.Collection;

public interface PlantService {

    Plant create(Plant plant);
    Collection<Plant> list(int limit);

    Plant get(Long id);

    Plant update(Plant plant);

    Boolean delete(Long id);
}
