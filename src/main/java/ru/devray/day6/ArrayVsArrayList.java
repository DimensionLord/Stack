package ru.devray.day6;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] heroesInArray = {"Бетмен", "Джокер", "Оби-Ван", "Олег"};

        ArrayList<String> heroesInList = new ArrayList<>();
        heroesInList.add("Бетмен");
        heroesInList.add("Джокер");
        heroesInList.add("Оби-Ван");
        heroesInList.add("Олег");

        ArrayList<String> heroesInList2 = new ArrayList<>(List.of("Бетмен", "Джокер", "Оби-Ван", "Олег"));

        //обращение к элементам
        //изменение элементов
        //удаление элементов
    }
}
