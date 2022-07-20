package web.controller;

import jdk.jfr.ContentType;
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
        if (amount < 0) {
            String s = "Amount must be >=0!)";
            model.addAttribute("negative", s);
        } else {
            model.addAttribute("cars", carService.listCars(amount));
        }
        return "cars";
    }
}
