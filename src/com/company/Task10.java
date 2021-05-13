package com.company;

public class Task10 {
    public static boolean task10(int a, int b, int c){
        int sum = a;
        for(int i = 0; i < b; i++){
            sum += sum;
        }
        return sum%c == 0;
    }
}
