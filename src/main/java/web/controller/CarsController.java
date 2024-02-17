package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Long count,
                               Model model) {
        CarService carService = new CarServiceImpl();

        carService.add(new Car("polo", "1234", "18"));
        carService.add(new Car("kia", "2312", "24"));
        carService.add(new Car("hyundai", "3542", "87"));
        carService.add(new Car("lada", "4123", "32"));
        carService.add(new Car("audi", "5551", "11"));

        if (count == null) {
            count = (long) 5;
        }

        List<Car> cars = carService.getAllCars(count);

        model.addAttribute("cars", cars);

        return "CarsView/cars";
    }

}
