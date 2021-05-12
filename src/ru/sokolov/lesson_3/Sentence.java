package ru.sokolov.lesson_3;

public class Sentence {
    public static void main(String[] args) {
        String str1 = " Предложение один    Теперь предложение два     Предложение три";
        System.out.println(str1);

        String str2 = str1.replaceAll(" +", " ");
        System.out.println(str2);

        StringBuilder stringbuilder = new StringBuilder(str2);

        for(int i = str2.length()-1; i >= 0; i--) { // Цикл идет с конца строки, чтобы правильно сработал insert
            if(str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Я') {
                stringbuilder.setCharAt(i-1, '.'); // Ставится точка перед заглавной
                stringbuilder.insert(i, ' '); // Добавляется пробел перед заглавной
            }
        }
        System.out.println(stringbuilder);

        stringbuilder.delete(0, 2); // Удаляется ". " перед первым предложением
        stringbuilder.append('.'); // Присоединяется '.' в конце предложения

        System.out.println(stringbuilder.toString());
    }
}
