package day1.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest
{
    private List<String> list = new ArrayList<>();
    public LambdaTest()
    {
        list.add("Anna");
        list.add("Marta");
        list.add("Hanna");
        list.add("Ula");
        list.add("Ala");
    }

    public void method1() {
        LambdaTest lambdaTest = new LambdaTest();
//        for(String s: lambdaTest.list)
//        {
//            System.out.println(s);
//        }

//        Consumer<String> cons = Consumer<String>()
//        {
//            public void accept(String s)
//            {
//                System.out.print(s + "-");
//            }
//        };
        lambdaTest.list.forEach(x -> System.out.print(x + "-"));
    }

    private void method2()
    {
        LambdaTest lambdaTest = new LambdaTest();
//        lambdaTest.list.forEach(System.out::println);

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };

        //lambdaTest.list.sort(comparator);
//        lambdaTest.list.sort((x, y) -> x.length() - y.length());
        Collections.sort(lambdaTest.list);
//        System.out.println("***********************************");
        lambdaTest.list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        //lambdaTest.method1();
        lambdaTest.method2();
    }
}
