package ru.sokolov.lesson_2;
// Java Операторы, циклы и структуры ветвления
import java.util.Random;
import java.util.Scanner;

public class IndependentWork {
    public static void main(String[] args) {
/*
        //Вывод чисел от 10 до 2
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 1);

 */

/*
        //Примеры цикла for

        //Напечатать цифры от 1 до 10 и квадрат этих чисел
        for (int i = 1; i < 11 ; i++) {
            System.out.println(i + " " + (i*i));
        }

        //Напечатать квадраты первых 100 целых чисел, по 10 шт.на строку
        for (int i = 1; i < 101 ; i++) {
            System.out.print(" " + i*i);
            if(i%10 == 0){
                System.out.println();
            }
        }

 */

/*
        //Напечатать все чётные числа от 0 до 20 включительно
        for (int i = 0; i <=20 ; i++) {
            if(i%2 ==0){
                System.out.print(" " + i);
            }
        }
        System.out.printf("\n");

        for (int i = 0; i <=20 ; i+=2) {
            System.out.print(" " + i);
        }
 */

/*
        //Пример таблицы умножения
        for (int i = 1; i < 11 ; i++) {
            for (int j = 1; j < 11; j++) {
                int num = (i * j);
                System.out.print(" " + num);
            }
            System.out.println();
        }

 */

/*
        //Пример кода, запрашивающий у пользователя ввод целого числа и выводящая в 2 раза больше
        Scanner scanner = new Scanner(System.in);//Создание объекта scanner класса Scanner
        System.out.println("Введите целое число");
        int res = scanner.nextInt();//Чтение целого числа в переменную res
        res *= 2;
        System.out.println(res);

        //Программа которая позволяет ввести данные только в заданных пределах
        //Количество попыток не ограничено
 */

/*
        int d = checkBounds("Введите число в пределах от 2 до 7", 2, 7);
        System.out.println("d = " + d);

 */

        //Сгенерируем случайные числа от 100 до 200
        int min = 100;
        int max = 200;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println(i);

    }
    public static int checkBounds(String message, int min, int max){
        Scanner scan = new Scanner(System.in);
        int x;
        do{
            System.out.println(message);
            x = scan.nextInt();
        } while (x < min || x > max);
        return x;
    }
}
