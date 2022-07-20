package service;

import models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Car1", "Sedan", 120));
        cars.add(new Car("Car2", "Hatchback", 96));
        cars.add(new Car("Car3", "SUV", 150));
        cars.add(new Car("Car4", "Truck", 390));
        cars.add(new Car("Car5", "Sport-car", 420));
    }


    @Override
    public List<Car> listCars(int amount) {
        if (amount < 5) {
            return cars.stream().limit(amount).collect(Collectors.toList());
        }
        return cars;
    }
}
