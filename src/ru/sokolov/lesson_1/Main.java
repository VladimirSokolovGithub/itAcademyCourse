package ru.sokolov.lesson_1;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
        // тест GitHub
        System.out.println("тест GitHub");
        System.out.println();
        System.out.println();


	// не возвращающие методы
        printMsg();
        String str = "Hello";
        printMessage(str);
        printMessage("Hello my brother");

    // возвращающие методы

        int res = calcTwoNumber(2,3);
        System.out.println(res);

    // другие примеры
    String s = null;
    int a = 10;

    // Двойной амперсанд && проверяет если первое условие истинно, значит второе уже не проверяется
    if(a < 5 && s.equals("a")){
        System.out.println("Ho ho ho");
    } else {
        System.out.println("end");
    }

    // Одинарный амперсанд & проверяет оба условия даже если первое условие истинно, в нашем случае второе условие false
       /*
       if(a < 5 & s.equals("a")){
            System.out.println("Ho ho ho");
        } else {
            System.out.println("end");
        }
        */

        //Приведение типов данных
        //бывает явное и неявное


        //Тернарный оператор
        int abc = 100;

        System.out.println(abc == 100 ? "abc = 100" : "abc !=100");

        if(abc ==10){
            System.out.println("abc = 10");
        } else {
            System.out.println("abc != 10");
        }


    }
    // не возвращающие методы
    public static void printMsg() {
        System.out.println("Hello world!");
    }

    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    // возвращающие методы
    public static int calcTwoNumber(int a, int b) {
        int res = a + b;
        return res;
    }

}
