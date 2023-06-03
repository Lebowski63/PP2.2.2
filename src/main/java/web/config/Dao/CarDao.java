package web.config.Dao;

import web.config.models.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCar(int count);

}
