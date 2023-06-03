package web.config.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.config.Dao.CarDao;
import web.config.models.Car;

import java.util.List;
@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }
}
