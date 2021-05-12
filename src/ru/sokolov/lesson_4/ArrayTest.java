package ru.sokolov.lesson_4;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] mas = new int[3][4];
        int count = 1;
        for (int i = 0; i < mas.length ; i++) {
            for (int j = 0; j < mas[i].length ; j++) {
                mas[i][j] = count;
                System.out.print(mas[i][j]+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println(mas[0][3]);
        System.out.println(mas[2][0]);
        System.out.println(mas[2][2]);
    }
}
