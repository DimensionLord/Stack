package ru.devray.day6.stack;

public class MyStack<T> {

    T[] elements = (T[]) new Object[10]; //{e,null,null,null}
    int index = -1;


    //класть
    public void push(T element) {
        index++;
        elements[index] = element;
    }

    //брать
    public T pop() {
        T element = elements[index];
        elements[index] = null;
        index--;
        return element;
    }

}
