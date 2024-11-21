package com.example.demo.config.initializer;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    private final CarRepository carRepository;

    // 생성자 주입 권장
    public DataInitializer(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) {
        // 자동차 데이터 초기화 로직
        initializeCars();
    }

    private void initializeCars() {
        List<Car> initialCars = Arrays.asList(
                Car.builder().model("a").build(),
                Car.builder().model("b").build()
        );
        carRepository.saveAll(initialCars);
    }
}