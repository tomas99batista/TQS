package tqs.tomas.ua.CarInformation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import tqs.tomas.ua.CarInformation.Model.Car;
import tqs.tomas.ua.CarInformation.Repository.CarRepository;

public class CarService {
    @Autowired
    CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public Car getCarDetails(String name){
        return carRepository.findByName(name);
    }
}
