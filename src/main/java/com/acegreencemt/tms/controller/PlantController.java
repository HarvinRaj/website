package com.acegreencemt.tms.controller;

import com.acegreencemt.tms.enumeration.Status;
import com.acegreencemt.tms.model.Plant;
import com.acegreencemt.tms.model.Response;
import com.acegreencemt.tms.service.implementation.PlantServiceImplementation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.acegreencemt.tms.enumeration.Status.ACTIVE;
import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/plant")
@RequiredArgsConstructor
public class PlantController {

    private final PlantServiceImplementation plantServiceImplementation;

    @GetMapping("/list")
    public ResponseEntity<Response>getPlants(){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("plants", plantServiceImplementation.list(10)))
                        .message("Plants Retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }


    @PostMapping("/save")
    public ResponseEntity<Response>savePlant(@RequestBody @Valid Plant plant){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(Map.of("plants", plantServiceImplementation.create(plant)))
                        .message("Plant created")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }

}
