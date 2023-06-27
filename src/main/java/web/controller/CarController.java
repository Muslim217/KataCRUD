package web.controller;

import org.springframework.lang.Nullable;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    String getCar(@Nullable @RequestParam("count") Integer count, Model model) {

        List<Car> cars = carService.getCar(count);
        model.addAttribute("cars", cars);
        return "cars";

    }


}
