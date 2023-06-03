package web.config.Dao;

import org.springframework.stereotype.Repository;
import web.config.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 1, "red"));
        cars.add(new Car("Audi", 2, "blue"));
        cars.add(new Car("Mercedes", 3, "green"));
        cars.add(new Car("Tesla", 4, "black"));
        cars.add(new Car("Ford", 5, "white"));
    }

    @Override
    public List<Car> getCar(int count) {
        if(count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
