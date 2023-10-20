package ru.devray.day6.forreview.returntypes;

public class CurrencyDemo {
    public static void main(String[] args) {
        int rubles = 5000;
        CurrencyConverter.exchangeRublesForDollars(rubles);
        //DB

        int dollars = 149;
        CurrencyConverter.exchangeDollarsForRubles(dollars);

    }
}
