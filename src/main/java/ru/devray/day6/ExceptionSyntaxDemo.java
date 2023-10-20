package ru.devray.day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSyntaxDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        try {
//            int age = scanner.nextInt();
//            age = age / 0;
//        } catch (InputMismatchException e) {
//            System.out.println("введено не число! повторите попытка");
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            System.out.println("произошло деление на ноль");
//            e.printStackTrace();
//            e.getMessage();
//        }

        //DRY dont repeat yourself
        try {
            int age = scanner.nextInt();
//            age = age / 0;
        } catch (InputMismatchException | ArithmeticException | NullPointerException e) {
            System.out.println("ПАНИКА ЧУДОВИЩНАЯ ОШИБКА");
            e.getMessage();
        } finally {
            System.out.println("Операция завершена");
        }

        //try - catch - finally

    }

    public static void calculateMeaningOfLife() {
        divideByZero();
    }

    public static void divideByZero() {
        int i = 1 / 0;
    }

    //        System.out.println("finished program");
//        System.out.println("finished program");
    //        int i = 1 / 0;

//        int[] arr = {1,2};
//        System.out.println(arr[6]); //exception here

//        System.out.println("finished program");
//        System.out.println("finished program");
}
