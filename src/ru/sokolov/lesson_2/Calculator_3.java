package ru.sokolov.lesson_2;

import java.util.Scanner;

public class Calculator_3 {

    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        consoleCalculator();
    }

    private static void consoleCalculator() {
        System.out.println("Введите выражение для вычисления");
        String[] line = scanner.nextLine().split(" ");
        Double currentResult = Double.parseDouble(line[0]);

        for (int i = 2, x = 1; i < line.length; i+=2, x+=2) {
            if(i == line.length -1){
                x = line.length -2;
            }
            switch (line[x]){
                case "+":
                    currentResult += Double.parseDouble(line[i]);
                    break;
                case "-":
                    currentResult -= Double.parseDouble(line[i]);
                    break;
                case "*":
                    currentResult *= Double.parseDouble(line[i]);
                    break;
                case "/":
                    currentResult /= Double.parseDouble(line[i]);
                    break;
                default:
                    System.out.println("Некорректный знак операции - " + line[1]);
            }
            System.out.println("Результат: " + currentResult);
        }
    }

}
