package com.acegreencemt.tms.model;


import com.acegreencemt.tms.enumeration.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.AUTO;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plant {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @NotEmpty(message = "Plant Name cannot be empty!")
    private String plantName;
    private Status status;
    private int createdBy;
    private LocalDateTime createdAt;
    private int updateBy;
    private LocalDateTime updateAt;

}
