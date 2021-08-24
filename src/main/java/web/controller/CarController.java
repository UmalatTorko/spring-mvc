package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, Model model) {

        Car car = new Car();
        if (count == null) {
            model.addAttribute("carsList", car.createListWithFiveCars());
        } else {
            model.addAttribute("carsList", car.getCarsList(car.createListWithFiveCars(), Integer.parseInt(count)));
        }
        return "car/cars";
    }
}
