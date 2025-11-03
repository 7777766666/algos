package com.example.algos.solution;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public void twoSumTarget() {

        while (true) {
            System.out.println("Введите число сумму которого хотите найти и через проблел числа, среди которых ищите сумму первого числа или 0/выход/exit");
            try {
                Scanner scanner = new Scanner(System.in);
                String array = scanner.nextLine().toLowerCase();

                if (array.equals("0") | array.equals("выход") | array.equals("exit")) {
                    break;
                }
                String[] split = array.split(" ");
                Integer[] arr = new Integer[split.length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(split[i]);
                }
                int target = arr[0];
                Integer[] nums = new Integer[arr.length - 1];
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = arr[i + 1];
                }
                TwoSum find = new TwoSum();
                int[] result = find.twoSum(nums, target);
                System.out.println(Arrays.toString(result));
            }catch (NumberFormatException e){
                System.out.println("Введите корректные данные");
            }
        }
    }

    private int[] twoSum(Integer[] nums, Integer target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int num = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (num == nums[j]) {
                    int[] twoSum = {i, j};
                    System.out.println(Arrays.toString(twoSum));
                    return twoSum;
                }
            }
        }
        System.out.println("Нет совпадений");
        return new int[0];
    }
}
