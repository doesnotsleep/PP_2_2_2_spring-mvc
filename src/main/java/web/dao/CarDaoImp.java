package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

    private final List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();
        cars.add(new Car("HONDA", "Tundra", 20000));
        cars.add(new Car("BMW", "X6", 30000));
        cars.add(new Car("MERCEDES", "Gelendwagen", 40000));
        cars.add(new Car("PORSCHE", "Cayenne", 35000));
        cars.add(new Car("LEXUS", "LX", 32000));


    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
