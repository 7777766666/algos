package com.example.algos;

import com.example.algos.polindrom.BubleSort;
import com.example.algos.polindrom.Palindrome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AlgosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgosApplication.class, args);

        while (true) {

            System.out.println("Выберите число для действия:");
            System.out.println("1 палиндром");
            System.out.println("2 пузырьковая сортировка массива");
            System.out.println("0 выход");
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
                }

            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число 1 или 2.");
            }
        }
    }
}
