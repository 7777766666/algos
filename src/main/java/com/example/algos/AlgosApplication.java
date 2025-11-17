package com.example.algos;

import com.example.algos.Lambda.Lambda;
import com.example.algos.model.People;
import com.example.algos.model.PeopleComparator;
import com.example.algos.model.Sex;
import com.example.algos.solution.SubStringIndex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Stream;

@SpringBootApplication
public class AlgosApplication {

    private static final Logger log = LoggerFactory.getLogger(AlgosApplication.class);

    public static void main(String[] args) throws InterruptedException {


        List<People> listPeople = Arrays.asList(
                new People("Svan", 22, Sex.MAN),
                new People("Petr", 34, Sex.MAN),
                new People("Lena", 34, Sex.WOOMAN),
                new People("Kate", 34, Sex.WOOMAN)
        );

        Integer[] arrInt = new Integer[]{5, 56, 12, -17};
        Integer reduce = Arrays.stream(arrInt)
                .reduce(0, (x, y) -> x + y);

        String[] arrStr = new String[]{"pr", "i", "vet2", null};
//        Optional<String> reduce1 = Arrays.stream(arrStr)
//                .reduce(String::concat);
        Integer reduce2 = Arrays.stream(arrStr)
                .filter(Objects::nonNull)
                .mapToInt(String::length)
                .sum();

        Integer reduce3 = Arrays.stream(arrStr)
                .map(str -> (str == null) ? 0 : str.length())
                .reduce(0, (x, y) -> x + y);


        log.info(reduce3 + " reduce");


        listPeople.stream()
                .sorted(new PeopleComparator())
                .forEach(System.out::println);
        System.out.println();
        listPeople.stream()
                .sorted(Comparator.comparing(People::getAge))
                .sorted(Comparator.comparing(People::getName))
                .forEach(System.out::println);
        System.out.println();
        listPeople.stream()
                .sorted(Comparator.comparing(p -> p.getName()))
                .forEach(System.out::println);

        OptionalDouble average = listPeople.stream()
                .mapToInt(People::getAge)
                .average();

        System.out.println(average + " avg");


//        int mem = new SubStringIndex().strStr("15memjrmem", "mem");
//        log.info("index = {}", mem);
//
//        System.out.println(new Lambda().incr("199", 6));
//        System.out.println(new Lambda().incr("10000", 1000));
//
//        List<String> list = Arrays.asList("1,2,3", "4,5,6,7", "7,8,9");
//
//        System.out.println(new Lambda().lolReturn());
//        System.out.println(new Lambda().lolReturn());
//
//        list.stream()
//                .flatMap(str -> Arrays.stream(str.split(",")))
//                .mapToInt(Integer::parseInt)
//                .sum();


//        new Lambda().start();
//        new Lambda().checkMore0();
//        Integer res = new Lambda().plusInt();
//        System.out.println("Result = " + res);
//        System.out.println("Больше 100 правда или нет: " + new Lambda().more100(100));
//        System.out.println(new Lambda().onlyPositiv(Arrays.asList(4, -235, -347, 5, -543, 87967865)));
//        System.out.println(new Lambda().sumArray(Arrays.asList("33", "66")));


//        log.info("index = {}", mem);


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
