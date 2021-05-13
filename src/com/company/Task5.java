package com.company;

public class Task5 {
    public static String operation(int a, int b, int N) {
        if(Math.abs(a - b) == N) return "Вычитание";
        else if ((a + b) == N) return "Сложение";
        else if ((a*b) == N) return "Умножение";
        else if ((a/b) == N || (b/a) == N) return "Деление";
        else return "none";
    }
}
