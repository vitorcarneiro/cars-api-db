package com.carsapi.carsapi.controller;

import com.carsapi.carsapi.dto.CarDTO;
import com.carsapi.carsapi.model.Car;
import com.carsapi.carsapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarsController {

    @Autowired
    private CarRepository repository;
    @PostMapping
    public void create(@RequestBody CarDTO req){
        System.out.println(req.model());
        repository.save(new Car(req));
    }
}
