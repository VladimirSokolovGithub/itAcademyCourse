package ru.sokolov.lesson_1;

// home work at lesson 1 / домашняя работа на урок 1

import java.util.Scanner;

public class HomeWorkLesson_1 {

    //private static int result;

    public static void main(String[] args) {

        // create variable and initialize them / создайте переменные и инициализируйте их
        int a, b, c;
        a = 10;
        b = 20;
        c = 5;

        int x = evaluatesTheExpression(10,20,5);
        System.out.println("Результат работы метода evaluatesTheExpression = " + x);

        boolean res = compareTwoNumber(-10,-5);
        System.out.println(res);

        System.out.println(compareTwoNumber(10, 20));

        message("Java сообщение!");

        isLeapYear();

    }

    // write a method that evaluates an expression / написать метод вычисляющий выражение (a+b)/c, где
    // a,b,c - входные параметры этого метода, метод должен возвращать результат

    public static int evaluatesTheExpression (int a, int b, int c){
        int result = (a + b)/c;
        return result;
    }

    // Написать метод, принимающий на вход два числа, и проверяющий что сумма этих чисел больше 0,
    // если да – вернуть true, в противном случае – false; (числа могут быть отрицательными)

    public static boolean compareTwoNumber(int a, int b){
        if ((a + b) > 0){
            return true;
        } else {
            return false;
        }
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая сообщение,
    // метод должен вывести в консоль сообщение «Java, сообщение!»;

    protected static void message(String str){
        System.out.println(str);
    }

    // Написать метод, который определяет количество дней в феврале, метод на вход принимает год,
    // а на консоль должен выводить кол-во дней. (может быть 28 или 29)

    protected static void isLeapYear (){
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
            System.out.println( "в " + year + " году" + " Количество дней в феврале - 29");
        } else {
            System.out.println( "в" + year + "году" + "Количество дней в феврале - 28");
        }
    }
}
