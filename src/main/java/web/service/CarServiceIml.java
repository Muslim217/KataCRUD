package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceIml implements CarService {
    private List<Car> firstListCars = new ArrayList<>();

    @PostConstruct
    private void addCar() {
        firstListCars.add(new Car("BMW 5 series", 500000, "Black"));
        firstListCars.add(new Car("Toyota Camry", 35000, "White"));
        firstListCars.add(new Car("Volkswagen Golf", 25000, "Blue"));
        firstListCars.add(new Car("LADA Vesta", 15000, "Gray"));
        firstListCars.add(new Car("Kia Rio", 18000, "Red"));


    }


    public List<Car> getCar(Integer count) {
        if (count != null) {
            return firstListCars.stream().limit(count).toList();
        }
        return firstListCars;
    }
}
