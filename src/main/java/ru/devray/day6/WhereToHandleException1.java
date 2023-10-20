package ru.devray.day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhereToHandleException1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            a = getUserInputNumber();
            b = getUserInputNumber();
        } catch (InputMismatchException e) {
            System.out.println("фокус не удался");
            e.printStackTrace();
            throw e;
        }

        int result = a + b;
        System.out.println(result);
    }

    public static int getUserInputNumber() {
        System.out.println("Введите число:");
        int userInputNumber = scanner.nextInt();
        return userInputNumber;
    }
}
