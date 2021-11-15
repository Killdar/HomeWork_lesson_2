package ru.geekbrains.HomeWork_lesson_2;

import java.util.Scanner;

public class Main {
    //Задача 1
    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    // (включительно), если да – вернуть true, в противном случае – false.
    public static boolean One(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }
    //Задача 2
    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void Two(int a) {
        Scanner scanner = new Scanner(System.in);
        if (a >= 0) {
            System.out.println("Число" + a + "положительное");
        }else {
            System.out.println("Число" + a + "отрицательное");
        }
    }
    //Задача 3
    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.
    public  static boolean Three(int a) {
        if(a < 0) {
            return true;
        } else {
            return false;
        }
    }
    //Задача 4
    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");

            }

        }
   //Задача 5*
    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
   // не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
   // при этом каждый 400-й – високосный.
   public static void Five(int year){
       if(year%4==0 && year%100 !=0 || year%400==0){
           System.out.println("Год високосный");
       }
       else {
           System.out.println("Год не високосный");
       }
   }
}




