package com.company;

import java.util.function.*;

public class Calculator<x, y> {
    public static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<String> devide = (x, y) -> Integer.parseInt(y) == 0 ? "На ноль нельзя делить!!" : String.valueOf(Integer.parseInt(x) / Integer.parseInt(y));

    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    public Predicate<Integer> isPositive = x -> x > 0;
    Consumer<String> println = System.out::println;
}