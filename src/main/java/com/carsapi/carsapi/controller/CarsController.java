package com.carsapi.carsapi.controller;

import com.carsapi.carsapi.dto.CarDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarsController {

    @PostMapping
    public void create(@RequestBody CarDTO req){
        System.out.println(req.model());
        System.out.println(req.brand());
        System.out.println(req.modelYear());
        System.out.println(req.value());
    }
}
