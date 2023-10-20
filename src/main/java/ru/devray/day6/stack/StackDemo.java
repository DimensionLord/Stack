package ru.devray.day6.stack;

import java.util.ArrayList;

public class StackDemo {
    public static void main(String[] args) {
//        Stack stack = new Stack();
        MyStack<String> stack = new MyStack<>();
//        MyStack<int> stack1;
//        MyStack<double> stack1;
        stack.push("футболка");
        stack.push("кардиган");
//        stack.push(new Object());
//        stack.push(new ArithmeticException());
        stack.push("носки");

        MyStack<Integer> i = new MyStack<>();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        for (int i = 0; i < 3; i++) {
            String currentString = (String) stack.pop();
            System.out.println(currentString.charAt(0));
        }

        ArrayList<Integer> list;


        Integer i1 = 1;
        Integer i2 = 34234;

        int result = i1 + i2;
    }
}
