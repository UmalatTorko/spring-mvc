package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> carList = new ArrayList<>();

    static
    {
        carList.add(new Car("BMW", 3, 1.6));
        carList.add(new Car("BMW", 4, 2.0));
        carList.add(new Car("BMW", 5, 2.0));
        carList.add(new Car("BMW", 6, 3.5));
        carList.add(new Car("BMW", 7, 6.3));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5 || count == 0) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}
