package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Dao.CarDaoImp;

import java.util.Arrays;

@Controller
@RequestMapping("/")
public class CarController {

    private final CarDaoImp carDaoImp;

    public CarController(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @GetMapping(value = "/cars")
   public String getCars(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carDaoImp.getCar(count));
        return "cars";
    }
}