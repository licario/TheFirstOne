package day1.sorting;

import java.util.Objects;

public class Car implements Comparable<Car>
{
    private String color;
    private String name;
    private int maxSpeed;
    private double price;
    private String producer;


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public Car(String color, String name, int maxSpeed, double price, String producer) {
        this.color = color;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.producer = producer;
    }

    @Override
    public int compareTo(Car o) {
        int a = producer.compareToIgnoreCase(o.getProducer());

        if(a==0)
        {
            a = name.compareToIgnoreCase(o.getName());
        }
        return a;
    }

    public boolean equals(Object o){
        Car car = (Car) o;
        return this.color.equals(car.getColor());
        //TODO: można rozbudować if'ami
    }

    public int hashCode(){
        return Objects.hash(color, name, maxSpeed, price, producer);
    }


}
