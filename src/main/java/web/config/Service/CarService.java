package web.config.Service;

import web.config.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCar(int count);
}
