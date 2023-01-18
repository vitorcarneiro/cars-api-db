package com.carsapi.carsapi.repository;

import com.carsapi.carsapi.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
