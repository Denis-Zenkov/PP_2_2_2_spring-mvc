package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {
    private CarService carService = new CarService();

    @GetMapping("/cars")
    public String getCars(@RequestParam("count") int count, Model model) {
        List<Car> list = carService.getCars(count);
        model.addAttribute("cars", list);
        return "cars";
    }
}
