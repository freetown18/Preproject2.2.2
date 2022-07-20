package web.controller;

import models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "amount") int amount, Model model) {
        List<Car> cars = new ArrayList<>();
            cars.add(new Car("Car1", "Sedan", 120));
            cars.add(new Car("Car2", "Hatchback", 96));
            cars.add(new Car("Car3", "SUV", 150));
            cars.add(new Car("Car4", "Truck", 390));
            cars.add(new Car("Car5", "Sport-car", 420));

        model.addAttribute("cars", carService.listCars(cars, amount));
        return "cars";
    }
}
