package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Какую задачу хотите посмотреть?");
	    switch (in.nextInt()){
            case 1:
                System.out.println("Задача №1(остаток от деления):");
                System.out.print("Введите числитель и знаменатель - ");
                System.out.println(Task1.ostatok(in.nextInt(), in.nextInt()));
                break;
            case 2:
                System.out.println("Задача №2(площадь треугольника):");
                System.out.print("Введите высоту и основание треугольника - ");
                System.out.println(Task2.S(in.nextFloat(), in.nextFloat()));
                break;
            case 3:
                System.out.println("Задача №3(количество лап животных у фермера):");
                System.out.print("Введите количество куриц, коров, свиней - ");
                System.out.println(Task3.Paws(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            case 4:
                System.out.println("Задача №4(arg1*arg2>arg3):");
                System.out.print("Введите 3 аргумента - ");
                System.out.println(Task4.task4(in.nextFloat(), in.nextFloat(), in.nextFloat()));
                break;
            case 5:
                System.out.println("Задача №5(действие для первых двух чисел, чтобы получить 3е):");
                System.out.print("Введите 3 аргумента - ");
                System.out.println(Task5.operation(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            case 6:
                System.out.println("Задача №6(ASCII):");
                System.out.print("Введите символ - ");
                System.out.println(Task6.ascii(in.next().charAt(0)));
                break;
            case 7:
                System.out.println("Задача №7(сумма последовательности чисел до числа и включая его):");
                System.out.print("Введите число - ");
                System.out.println(Task7.task7(in.nextInt()));
                break;
            case 8:
                System.out.println("Задача №8:");
                System.out.print("Введите 2 стороны треугольника (int) - ");
                System.out.println(Task8.triangleThird(in.nextInt(), in.nextInt()));
                break;
            case 9:
                System.out.println("Задача №9(сумма кубов):");
                System.out.print("Введите количество эллементов массива - ");
                int[] arr = new int[in.nextInt()];
                System.out.print("Введите числа для массива - ");
                for(int i = 0; i < arr.length; i++){
                    arr[i] = in.nextInt();
                }
                System.out.println(Task9.sumOfCubes(arr));
                break;
            case 10:
                System.out.println("Задача №10(делится ли А, добавленное к себе В раз, на С):");
                System.out.print("Введите a, b, c - ");
                System.out.println(Task10.task10(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            default:
                System.out.println("Такой задачи нет.");


        }

    }
}
