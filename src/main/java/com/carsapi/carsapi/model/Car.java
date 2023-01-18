package com.carsapi.carsapi.model;

import com.carsapi.carsapi.dto.CarDTO;
import jakarta.persistence.*;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@Entity
public class Car {
    public Car(@NotNull CarDTO data) {
        this.model = data.model();
        this.brand = data.brand();
        this.fabricationDate = data.fabricationDate();
        this.value = data.value();
        this.modelYear = data.modelYear();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String model;

    @Column(length = 50)
    private String brand;

    @Column(length = 10)
    private String fabricationDate;

    @Column
    private double value;

    @Column(length = 4)
    private String modelYear;

    public Car() {
    }
}
