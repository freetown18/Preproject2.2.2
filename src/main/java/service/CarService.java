package service;

import models.Car;

import java.util.List;

public interface CarService {
    List<Car> listCars(List<Car> cars, int amount);
}
