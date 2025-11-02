package com.example.algos.polindrom;

import java.util.Scanner;

public class Palindrome {
    public void poli() {

        while (true) {

            System.out.println("Напишите слово, чтоб узнать палиндром или нет или выход/exit");
            Scanner scanner = new Scanner(System.in);
            String readLine = scanner.nextLine().toLowerCase();

            if (readLine.equals("выход") | readLine.equals("exit")) {
                break;
            }

            boolean palindromResult = isPalindrom(readLine);

            System.out.println("String " + readLine + " pallindrom: " + palindromResult);
        }
    }
    private boolean isPalindrom(String readLine) {
        char[] charArray = readLine.toCharArray();

        int start = 0;
        int last = readLine.length() - 1;
        while (start < last) {
            if (charArray[start] == charArray[last]) {
                start++;
                last--;
            } else {
                return false;
            }
        }
        return true;
    }
}
