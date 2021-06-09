package ru.sokolov.lesson_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

//        int a, b;
//        int[] mass = {1,2,3};
//        a = 10;
//        b = 0;
//
//        try {
//            int c = a / b;
//            mass[20] = 10;
//            System.out.println("go");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Обратились за пределы массива");
//
//            try {
//
//            }catch (Exception e1){
//
//            }
//        }

//        catch (RuntimeException e){
//            System.out.println("Общая ошибка");
//        }

//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Обратились за пределы массива");
//        } catch (ArithmeticException e){
//            System.out.println("Арифметическая ошибка");
//        }

//        try {
//            FileInputStream inputStream = new FileInputStream("1.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        //throw new RuntimeException("Ошибка");

        //System.out.println("END!");

//        try {
//            sqrt(-5);
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

        //server
//        try {
//            doSomeThing();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        try{
//            int i = 10 / 0;
//        } catch (ArithmeticException e){
//
//        } finally {
//
//        }

        //System.out.println(doFin());

        //try с ресурсами пример
//        try (FileInputStream fileInputStream = new FileInputStream("2.txt")) {
//            fileInputStream.read();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }

    public static int doFin(){
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void doSomeThing() throws FileNotFoundException {
        //client
        FileInputStream fileInputStream = new FileInputStream("2.txt");
    }

    static int sqrt(int n){
       if(n > 0){
            return n/2;
       }
       throw new ArithmeticException("Нельзя использовать отрицательные значения");
    }


    static void a() {
        b();
    }

    static void b() {
        c();
    }

    static void c() {
        int a = 0;
        int b = 10 / a;
    }
}

