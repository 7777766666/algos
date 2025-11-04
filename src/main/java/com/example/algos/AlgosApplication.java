package com.example.algos;

import com.example.algos.lesson.Lambda;
import com.example.algos.solution.BubleSort;
import com.example.algos.solution.Palindrome;
import com.example.algos.solution.SearchInsert;
import com.example.algos.solution.TwoSum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class AlgosApplication {

    public static void main(String[] args) {

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
