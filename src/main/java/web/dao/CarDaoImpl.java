package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();

    public void add(Car car) {
        carList.add(car);
    }
    public List<Car> getAllCars(long count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
