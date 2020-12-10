package com.codecool.springTW.controllers;

import com.codecool.springTW.models.Car;
import com.codecool.springTW.models.User;
import com.codecool.springTW.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getCars(){
        return carService.getAllCars();
    }

    @GetMapping("cars/{id}")
    public Car getCar(@PathVariable Long id){
        return carService.getCarById(id);
    }

    @DeleteMapping("cars/{id}")
    public void removeCar(@PathVariable Long id) {
        carService.removeCar(id);
    }

    @PostMapping("/cars/add")
    public void addCar(@RequestBody Car car){
        System.out.println("Car added");
    }
}
