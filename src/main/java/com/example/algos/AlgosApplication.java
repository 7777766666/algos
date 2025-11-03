package com.example.algos;

import com.example.algos.solution.BubleSort;
import com.example.algos.solution.Palindrome;
import com.example.algos.solution.TwoSum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AlgosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgosApplication.class, args);

        while (true) {

            System.out.println("0 выход");
            System.out.println("Выберите число для действия:");
            System.out.println("1 палиндром");
            System.out.println("2 пузырьковая сортировка массива");
            System.out.println("3 нахождение суммы двух чисел по таргету");
            Scanner scanner = new Scanner(System.in);
            String scan = scanner.nextLine();
            try {
                Integer number = Integer.parseInt(scan);
                if (number == 0) {
                    break;
                } else if (number == 1) {
                    new Palindrome().poli();
                } else if (number == 2) {
                    new BubleSort().bubleSort();
                } else if (number == 3){
                    new TwoSum().twoSumTarget();
                }

            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число 1 или 2.");
            }
        }
    }
}
