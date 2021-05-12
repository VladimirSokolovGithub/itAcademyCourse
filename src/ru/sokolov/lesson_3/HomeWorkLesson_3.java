package ru.sokolov.lesson_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLesson_3 {
    public static void main(String[] args) {
        int[] trees = new int[378];
        File file = new File("C:\\testData\\test.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);// здесь Scanner впитал в себя данные из файла
            //теперь мы должны извлечь эти данные с помощью цикла
            int i = 0;
            while (sc.hasNextInt()) {
                trees[i++] = sc.nextInt();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
        System.out.println(Arrays.toString(trees));

        int[] counters = new int[20];
//        int max = 0;
//        for(int i = 0; i < trees.length; i++) {
//              if(trees[i] == counters[i]){
//                  counters[i-1]++;
//              }
//              if(i > max){
//              max = i;
//              }
//        }
//        System.out.println(Arrays.toString(counters));
//
//
//        for (int i = 0; i < trees.length; i++) {
//            if(trees[i] == counters[i]){
//                max = i;
//                counters[i]++;
//            }
//
//        }
        int max = 0;
        for(int i: trees){
            counters[i-1]++;
            if(i>max){
                max = i;
            }
        }

        for(int i =0; i< max;i++){
            System.out.print(" "+(i+1));
        }
        System.out.print('\n');
        for(int i =0; i< max;i++){
            System.out.print(" "+counters[i]);
        }



    }
}
