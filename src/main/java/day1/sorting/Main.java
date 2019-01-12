package day1.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    List<Car> list = new ArrayList<>();

//    public Main() {
//        List<Car> list = ListCreat.getCars();
//    }

    public static void main(String[] args) {
        Main main = new Main();
  //     Collections.sort(main.list);
//        main.list.forEach(x -> System.out.println(x.getName() + ": " + x.getProducer()));

//        Collections.sort(main.list, (x,y) -> (int)(x.getPrice() - y.getPrice()));
 //       main.list.forEach(System.out::println);

       Car car1 = main.list.get(3);
       Car car2 = main.list.get(5);

        System.out.println(car1);
        System.out.println(car2);
//TODO: nie zadziała, pokaże false        System.out.println(car1.equals(car2));
 //       System.out.println(car1.toString().equals(car2.toString()));
        System.out.println(car1.equals(car2));
    }


}
