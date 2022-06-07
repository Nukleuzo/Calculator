package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = (int) calc.plus.apply(1, 2);
        int b = (int) calc.minus.apply(1,1);
        String c = (String) calc.devide.apply(String.valueOf(a), String.valueOf(b)); // Возможна ошибка деления на ноль

        calc.println.accept(c);

    }
}
