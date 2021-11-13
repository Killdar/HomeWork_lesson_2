package ru.geekbrains.HomeWork_lesson_2;

import java.util.Scanner;

public class Main {
    //Задача 1
    public static boolean One(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }
    //Задаче 2
    public static void Two(int a) {
        Scanner scanner = new Scanner(System.in);
        if (a >= 0) {
            System.out.println("Число" + a + "положительное");
        }else {
            System.out.println("Число" + a + "отрицательное");
        }
    }
    //Задача 3
    public  static boolean Three(int a) {
        if(a < 0) {
            return true;
        } else {
            return false;
        }
    }
    //Задача 4
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");

            }

        }
   //Задача 5*
   public static void Five(int year){
       if(year%4==0 && year%100 !=0 || year%400==0){
           System.out.println("Год високосный");
       }
       else {
           System.out.println("Год не високосный");
       }
   }
}




