package ru.devray.day6;

import java.io.IOException;

public class ExceptionTypesDemo {
    public static void main(String[] args) {

        //НЕПРОВЕРЯЕМОЕ
//        try {
//            int i = 1 / 0; //AritmeticException
//        } catch (ArithmeticException e) {
//
//        }
        throwUncheckedException();

//        String s = null; //NullPointerException
//
//        s.toString();

//        ArithmeticException e = new ArithmeticException();
//        throw e;

        //ПРОВЕРЯЕМОЕ

        throwUncheckedException();

    }

    public static void throwCheckedException() throws IOException {
        IOException e1 = new IOException(); //
        throw e1;
    }

    public static void throwUncheckedException() {
        ArithmeticException e = new ArithmeticException();
        throw e;
    }
}
