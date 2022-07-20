package service;

import models.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List<Car> listCars(List<Car> cars, int amount) {
        if (amount < 5) {
            return cars.stream().limit(amount).collect(Collectors.toList());
        }
        return cars;
    }
}
