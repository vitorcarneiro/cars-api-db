package com.carsapi.carsapi.dto;

public record CarDTO(String model, String brand, String fabricationDate, double value, String modelYear) {
    @Override
    public String model() {
        return model;
    }

    @Override
    public String brand() {
        return brand;
    }

    @Override
    public String fabricationDate() {
        return fabricationDate;
    }

    @Override
    public double value() {
        return value;
    }

    @Override
    public String modelYear() {
        return modelYear;
    }
}
