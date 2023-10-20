package ru.devray.day6.stack;

public class Stack {

    Object[] elements = new Object[10]; //{e,null,null,null}
    int index = -1;


    //класть
    public void push(Object element) {
        index++;
        elements[index] = element;
    }

    //брать
    public Object pop() {
        Object element = elements[index];
        elements[index] = null;
        index--;
        return element;
    }

}
