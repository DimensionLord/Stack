package ru.devray.day6.stack;

import java.util.ArrayList;

public class StackDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("футболка");
        stack.push("кардиган");
        stack.push("носки");
        for (int i = 0; i < 3; i++) {
            String currentString = (String) stack.pop();
            System.out.println(currentString.charAt(0));
        }
        for (int i = 0; i < 4; i++) {
            stack.push("футболка");
            stack.push("кардиган");
            stack.push("носки");
        }
    }
}
