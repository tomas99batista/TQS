package tqs.tomas.ua.CarInformation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import tqs.tomas.ua.CarInformation.Model.Car;
import tqs.tomas.ua.CarInformation.Service.CarService;

public class CarController {
    @Autowired
    CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    public Car getCar(String name){
        return carService.getCarDetails(name);
    }
}
