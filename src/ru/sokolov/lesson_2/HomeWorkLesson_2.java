package ru.sokolov.lesson_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWorkLesson_2 {
    public static void main(String[] args) throws Exception {
        // Консольный калькулятор
                System.out.println("Enter the numbers and the operation sign:(\"+\"; \"-\"; \"/\"; \"*\") " +
                "separated by a space (for example 2 / 3)");
        Double number1;
        Double number2;

        char operation;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = (reader.readLine());
        char[] line = str.toCharArray();

        int firstSpace = 0;

        for (int i = 0; i < line.length; i++) {
            if(line[i] == ' '){
                firstSpace = i;
                break;
            }
        }

        number1 = Double.parseDouble(new String(Arrays.copyOfRange(line,0,firstSpace)));
        number2 = Double.parseDouble(new String(Arrays.copyOfRange(line,firstSpace+3,line.length)));
        operation = line[firstSpace+1];
        Double result = doOperation(number1,number2,operation);
        System.out.println("результат: " +result);

    }

    public static Double doOperation(Double number1, Double number2, char operation) throws Exception{
        Double result;
        switch (operation){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Операция \""+ operation +"\" не поддерживается");
                throw new Exception("Операция \""+ operation +"\" не поддерживается");
        }
        return result;
    }

}
