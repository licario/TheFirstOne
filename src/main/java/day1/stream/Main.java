package day1.stream;

import day1.sorting.Car;
import day1.sorting.ListCreat;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    List<Car> list = ListCreat.getCars();

    public static void main(String[] args) {
        Main main = new Main();
        List<Car> carsByColor = main.findByColor("dupa");
        carsByColor.forEach(System.out::println);
    }

    private List<Car> findByColor(String color)
    {
        List<Car> listCar = new ArrayList<>();
        for (Car car: list){
            if(car.getColor().equals(color)){
                listCar.add(car);
            }
        }
        return listCar;
    }
}
