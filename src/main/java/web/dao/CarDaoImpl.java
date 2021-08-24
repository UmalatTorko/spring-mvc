package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;


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
            return carList.subList(0, count);
        }
    }
}
