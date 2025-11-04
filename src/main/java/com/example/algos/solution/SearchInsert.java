package com.example.algos.solution;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsert {

    public void search() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число индекс которого вы хотите найти или 0 для выхода");

            try {

                   String targetString = scanner.nextLine();

                if (targetString.equals("0")) {
                    break;
                }
                int target = Integer.parseInt(targetString);
//                scanner.close();
                System.out.println("Введите числа через пробел, среди которых ищете индекс числа или где оно должно быть");
                String array = scanner.nextLine();
                String[] split = array.split(" ");
                Integer[] arr = new Integer[split.length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(split[i]);
                }
                int[] nums = new int[arr.length];
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = arr[i];
                }

                int result = SearchInsertIndex(nums, target);
                System.out.println(result);
            } catch (NumberFormatException e) {
                System.out.println("Введите корректные данные");
            }

        }
        scanner.close();
    }

    private int SearchInsertIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int pivot = left + (right - left) / 2;
            if (target == nums[pivot]){
                return pivot;
            } else if (target > nums[pivot]){
                left = pivot + 1;
            } else {
                right = pivot -1;
            }
        }
        return left;
    }
}