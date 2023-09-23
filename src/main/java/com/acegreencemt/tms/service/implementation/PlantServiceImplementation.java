package com.acegreencemt.tms.service.implementation;

import com.acegreencemt.tms.model.Plant;
import com.acegreencemt.tms.repository.PlantRepository;
import com.acegreencemt.tms.service.PlantService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class PlantServiceImplementation implements PlantService {

    private final PlantRepository plantRepository;

    @Override
    public Plant create(Plant plant) {
        return plantRepository.save(plant);
    }

    @Override
    public Collection<Plant> list(int limit) {
        return plantRepository.findAll(PageRequest.of(0, limit)).toList();
    }

    @Override
    public Plant get(Long id) {
        return plantRepository.findById(id).get();
    }

    @Override
    public Plant update(Plant plant) {
        return plantRepository.save(plant);
    }

    @Override
    public Boolean delete(Long id) {
        plantRepository.deleteById(id);
        return true;
    }
}
