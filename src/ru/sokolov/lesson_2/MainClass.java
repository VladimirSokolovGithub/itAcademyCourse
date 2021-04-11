package ru.sokolov.lesson_2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        // Проверка примитивных и ссылочных типов данных
        /*
        int i1 = 1;
        Integer i2 = 1;
        int[] mass = {1,2,3};

        test1(i1);
        test2(i2);
        test3(mass);

        System.out.println();

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(Arrays.toString(mass));
        */

        /*
        //Конструкция switch - case
        int a = 10;
        switch (a){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
            default:
                System.out.println("Нет такого значения");
        }
        */

        /*
        // Постфиксный и префиксный инкремент
        int i1 = 1;
        System.out.println(i1++); // вначале данные вывелись на консоль а потом увеличелись

        int i2 = 1;
        System.out.println(++i2); // вначале данные увеличелись а потом вывелись на консоль
        */

        /*
        // Цикл "for"
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }

        //пример бесконечного цикла
        for (; ;) {
            System.out.print(1);
         */

        /*
        // Цикл "while"
        int i = 20;
        while (i > 10){
            System.out.println(i);
            i--;
        }

        // Цикл "do - while"
        int i1 = 2;
        do {
            System.out.println(i1);
        } while (i1 > 10);
        */

        /*
        // Вложенный цикл
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.println(i + " " + j);
            }
        }
        */

        /*
        // Вывод значений в консоль в виде квадратной матрицы с помощью вложенного цикла
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5 ; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }

        // Вывод значений в консоль в виде квадратной матрицы с нужной диагональю помощью вложенного цикла
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                if (i == j){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }

            System.out.println();
        }
        */

        /*
        //Одномерные Массивы
        //Создание целочисленного массива 1-й вариант
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        //Создание целочисленного массива 2-й вариант
        int[] array = {1,2,3,4};

        //Создание строкового массива
        String[] arr2 = {"hello", "world"};

        // вывод целочисленного массива в консоль
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // вывод целочисленного массива в консоль используя метод Arrays.toString();
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(array)); // вывод целочисленного массива в консоль 2-й вариант

        System.out.println(Arrays.toString(arr2));
        */

        /*
        //Двумерные массивы
        // создадим двумерный массив размерностью 3 на 4
        int[][] table = new int[3][4]; //тройка отвечает за строки, четверка за столбцы
        int count = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = count;
                System.out.print(table[i][j]+ " ");
                count++;
            }
            System.out.println();
        }

        // Объявление и заполнение значениями двумерного массива размерностью 3 на 4
        int[][] table1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        */

        /*
        // Нерегулярные или зубчатые массивы
        int[][] table2 = new int[3][]; // двумерный массив без заданного значения размерности
                                        // вложенных массивов становиться нерегулярным
        //это означает что вложенные массивы могут быть разной длинны
        // первый может содержать 5 элементов, второй 6 элементов, 3-й - 8 элементов и т.д.
        table2[0] = new int[5];
        table2[1] = new int[6];
        table2[2] = new int[8];

        int count = 1;
        for (int i = 0; i < table2.length; i++) {
            for (int j = 0; j < table2[i].length; j++) {
                table2[i][j] = count;
                System.out.print(table2[i][j]+ " ");
                count++;
            }
            System.out.println();
        }

        // Многомерные массивы (трёх и более мерные)
        int[][][] table3 = new int[3][][]; // пример многомерного нерегулярного массива
        */

        /*
        // Цикл foreach
        // Цикл foreach для одномерного массива
        int[] array2 = {1,2,3,4,5};
        for (int i: array2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Цикл foreach для двумерного массива
        int[][] table3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int[] i: table3) { // int[] i - заходим в наш первый массив размерностью 3 эл-та
            for (int j: i) { // перебераем нашы вложенные одномерные массивы
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        // Стандартный алгоритм сортировки "Сортировка пузырьком"
        int[] array3 = {1,7,4,2};
        for (int i = array3.length - 1; i >0 ; i--) { // длинна массива минус 1, будет равна индексу
                                                        // последнего элемента т.е. индексу четвертого элемента - 3
            for (int j = 0; j < i; j++) {
                if(array3[j] > array3[j+1]){
                    int tmp = array3[j];
                    array3[j] = array3[j+1];
                    array3[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array3));


    }

    // Методы для проверки примитивных и ссылочных типов данных
    /*
    public static void test1 (int i) {
        i++;
        System.out.println(i);
    }

    public static void test2 (Integer i) {
        i++;
        System.out.println(i);
    }

    public static void test3 (int[] mass) {
        mass[2] = 10;
        System.out.println(Arrays.toString(mass));
    }
    */


}
