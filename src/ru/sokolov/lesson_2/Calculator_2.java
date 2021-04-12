package ru.sokolov.lesson_2;

import java.util.Scanner;

/*
Необходимо написать простой консольный калькулятор на Java.

    Метод int getInt() - должен считывать с консоли целое число и возвращать его
    Метод char getOperation() - должен считывать с консоли какое-то значение
    и возвращать символ с операцией (+, -, * или /)
    Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2
    арифметическую операцию, заданную operation.
    Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию
    (с помощью getOperation(), передать все методу calc() и вывести на экран результат.

 */

public class Calculator_2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Double num1 = getDouble();
        Double num2 = getDouble();
        char operation = getOperation();
        Double result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static Double getDouble(){
        System.out.println("Введите число");
        Double num = null;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } 
        return num;
    }

    public static char getOperation(){
        System.out.println("Enter the operation sign:(\"+\"; \"-\"; \"/\"; \"*\")");
        char operation = 0;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    public static Double calc(Double num1, Double num2, char operation){
        Double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}
