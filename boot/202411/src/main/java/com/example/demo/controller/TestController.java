package com.example.demo.controller;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {

    private final CarRepository carRepository;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/api/cars")
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carRepository.findAll();
        return ResponseEntity.ok(cars);
    }
}
