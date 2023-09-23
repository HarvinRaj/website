package com.acegreencemt.tms;

import com.acegreencemt.tms.enumeration.Status;
import com.acegreencemt.tms.model.Plant;
import com.acegreencemt.tms.repository.PlantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmsApplication.class, args);
	}

	@Bean
	CommandLineRunner run(PlantRepository plantRepository){
		return args -> {
			plantRepository.save(new Plant(null, "JEP", Status.ACTIVE, 999, LocalDateTime.now(), 999, LocalDateTime.now()));
		};
	}


}
