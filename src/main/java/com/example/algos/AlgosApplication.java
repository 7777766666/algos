package com.example.algos;

import com.example.algos.Lambda.Increment;
import com.example.algos.Lambda.Lambda;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class AlgosApplication {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(new Lambda().incr("199", 6));
        System.out.println(new Lambda().incr("10000", 1000));

        List<String> list = Arrays.asList("1,2,3", "4,5,6,7", "7,8,9");

        System.out.println(new Lambda().lolReturn());
        System.out.println(new Lambda().lolReturn());

        list.stream()
                .flatMap(str -> Arrays.stream(str.split(",")))
                .mapToInt(Integer::parseInt)
                .sum();




        new Lambda().start();
        new Lambda().checkMore0();
        Integer res = new Lambda().plusInt();
        System.out.println("Result = " + res);
        System.out.println("Больше 100 правда или нет: " + new Lambda().more100(100));
        System.out.println(new Lambda().onlyPositiv(Arrays.asList(4, -235, -347, 5, -543, 87967865)));
        System.out.println(new Lambda().sumArray(Arrays.asList("33", "66")));




//
//        SpringApplication.run(AlgosApplication.class, args);
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Выберите число для действия:");
//            System.out.println("0 выход");
//            System.out.println("1 палиндром");
//            System.out.println("2 пузырьковая сортировка массива");
//            System.out.println("3 нахождение суммы двух чисел по таргету");
//            System.out.println("4 нахождение индекса  по таргету");
//
//            String scan = scanner.nextLine();
//            try {
//                Integer number = Integer.parseInt(scan);
//                switch (number) {
//                    case 0 -> {
//                        scanner.close();
//                        System.exit(0);
//                    }
//                    case 1 -> new Palindrome().poli();
//                    case 2 -> new BubleSort().bubleSort();
//                    case 3 -> new TwoSum().twoSumTarget();
//                    case 4 -> new SearchInsert().search();
//                    default -> System.out.println();
//                }
//
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка! Введите число от 0 до ...");
//            }
//       scanner.close();
//        }
    }
}
