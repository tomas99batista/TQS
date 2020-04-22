package tqs.tomas.ua.CarInformation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tqs.tomas.ua.CarInformation.Model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByName (String name);
}
