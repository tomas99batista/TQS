package tqs.tomas.ua.CarInformation.Model;

import javax.persistence.*;

@Entity(name = "car")
@Table
public class Car {
    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = false)
    private String name;

    @Column(nullable = false, unique = false)
    private String marker;

    public Car() {
    }

    public Car(String name, String marker) {
        this.name = name;
        this.marker = marker;
    }
}
