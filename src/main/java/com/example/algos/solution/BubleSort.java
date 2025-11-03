package com.example.algos.solution;

import java.util.Arrays;
import java.util.Scanner;

public class BubleSort {

    public void bubleSort() {

        while (true) {
            System.out.println("Введите Числа через проблел для сортировки пузырьком или 0 для выхода");
            try {
                Scanner scanner = new Scanner(System.in);
                String array = scanner.nextLine();
                if (array.equals("0")) {
                    break;
                }
                String[] split = array.split(" ");
                Integer[] arr = new Integer[split.length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(split[i]);
                }
                sort(arr);
            } catch (NumberFormatException e) {
                System.out.println("Не корректный формат ввода данных");
            }
        }
    }

    private Integer[] sort(Integer[] array) {

        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
