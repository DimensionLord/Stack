package ru.devray.day6.stack;

import ru.devray.day6.A;

import java.util.Arrays;

/**
 * Дженерик это концепция, которая позволяет в классе объявить о том, что мы создаем стек каких-то объектов (мы пока еще не знаем каких).
 * А при создании инстанса уточнить тип объектов, которые мы будем класть в стек.
 * @param <T> указывает на наиболее абстрактный (широкий) тип объектов, которые могут храниться в стеке.
 */
public class MyStack<T> {

    private T[] elements = (T[]) new Object[10];
    private int index;


    public void push(T element) {
        if (index == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[index++] = element;
    }

    public T pop() {
        if (index == -1) {
            return null;
        }
        T element = elements[--index];
        elements[index] = null;
        return element;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
