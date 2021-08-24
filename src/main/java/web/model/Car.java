package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int series;
    private double engine;

    public Car() {
    }

    public Car(String model, int series, double engine) {
        this.model = model;
        this.series = series;
        this.engine = engine;
    }

    public List<Car> createListWithFiveCars(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 3, 1.6));
        carList.add(new Car("BMW", 4, 2.0));
        carList.add(new Car("BMW", 5, 2.0));
        carList.add(new Car("BMW", 6, 3.5));
        carList.add(new Car("BMW", 7, 6.3));
        return carList;
    }

    public List<Car> getCarsList(List<Car> carList, int count) {
        if (count >= 5) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return  "Model: " + model + " " +
                "Series: " + series + " " +
                "Engine: " + engine;
    }
}
