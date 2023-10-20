package ru.devray.day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhereToHandleException {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getUserInputNumber();
        int b = getUserInputNumber();
        int result = a + b;
        System.out.println(result);
    }

    public static int getUserInputNumber() {
        System.out.println("Введите число:");
        while (true) {
            try {
                int userInputNumber = scanner.nextInt();
                return userInputNumber;
            } catch (InputMismatchException e) {
                System.out.println("Повторите ввод");
                throw e;
            }
        }
    }
}
