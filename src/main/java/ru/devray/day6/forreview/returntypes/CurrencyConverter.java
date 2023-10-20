package ru.devray.day6.forreview.returntypes;

public class CurrencyConverter {

    public static void exchangeRublesForDollars(int rublesAmount){
        System.out.println(String.format("За %d руб. ты получишь %f $", rublesAmount, rublesAmount * 0.01));
    }

    public static void exchangeDollarsForRubles(int dollarsAmount){
        System.out.println(String.format("За %d $ ты получишь %d руб.", dollarsAmount, dollarsAmount * 100));
    }

}
