package com.company;

import java.util.function.*;

import static java.lang.Integer.*;

public class Calculator<x, y> {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<String> devide = (x, y) -> Integer.parseInt(y) == 0 ? "На ноль нельзя делить!!" : String.valueOf(Integer.parseInt(x) / Integer.parseInt(y));

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<String> println = System.out::println;
}