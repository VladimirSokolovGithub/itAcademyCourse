package ru.sokolov.lesson_3;

import java.util.Arrays;
import java.util.Random;

public class IndependentWork {
    public static void main(String[] args) {
        //Вызов метода "crossFill" на заполнение двумерного массива главной и побочной диагонали еденицами 1
        final int side = 10;
        int[][] mass5 = new int[side][side];
        //crossFill(mass5);
        for (int i = 0; i < mass5.length; i++) {
            for (int j = 0; j < mass5.length; j++) {
                System.out.print(mass5[i][j] + " ");
            }
            System.out.println();
        }

        //Вызовем метод "getRandomNumber" для формирования лотерейного билета
        int[] mass6 = getRandomNumber();
        System.out.println(Arrays.toString(mass6));


        //В приведенном ниже примере массив mass заполняется числами от 0 до 4
        int[] mass = new int[5];
        for (int i = 0; i < 5 ; i++) {
            mass[i] = i;
            System.out.print(" " + mass[i]);
        }
        System.out.println();

        //Заполняем двумерный массив, состоящий из четырех ячеек (4 строк) и в каждой из ячеек хранится
        //массив интов размерностью 5 элемментов(5 столбцов), целыми числами от 1 до 20 так как перемножив
        // 5*4 мы получаем двумерный массив размерностью 20
        int count = 1;
        int[][] table = new int[4][5];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++) {
                table[i][j] = count;
                System.out.print(table[i][j] + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(table));//метод почему то выдаёт адрес ссылки вместо содержимого массива

        int[] arr = {1,2,3,4};
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
    //Теперь создадим метод "crossFill" выведем на консоль матрицу из нолей,
    // но основную и побочную диагональ заполним 1(еденицами) - далее вызовем наш метод
    private static void crossFill(int[][] mass){
        int str, bkw;
        for (str = 0, bkw = mass.length - 1; str < mass.length; str++,bkw--) {
            mass[str][bkw] = 1;
            mass[str][str] = 1;
        }
    }

    //Составим программу и метод "getRandomNumber" формирования лотерейного билета
    public static int[] getRandomNumber(){
        int[] mass = new int[6];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(50);
        }
        return mass;
    }
}
