package com.codecool.springTW.services;

import com.codecool.springTW.models.Car;
import com.codecool.springTW.models.User;
import com.codecool.springTW.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public Car getCarById(Long id){
        return carRepository.findById(id).orElseThrow();
    }

    public void removeCar(Long id){
        carRepository.deleteById(id);
    }
}
