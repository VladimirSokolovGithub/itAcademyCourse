package ru.sokolov.lesson_3;

public class HomeWork {
    public static void main(String[] args) {
        /*Есть какая-то строка в которой три предложения. Наша задача привести эту строку к нормальному виду
        что бы было предложение один. точка Предложение два. точка Предложение три. точка
        и между словами должен быть только один пробел*/

        String str1 = "Предложение    один   Предложение    два   Предложение    три.";
        System.out.println(str1);

        String str2 = str1.replaceAll(" +", " "); //Метод replaceAll использует регулярные выражения
        //и говорит что нужно заменить там где больше одного пробела " +" на один пробел " "
        // (так же эта операция называется "Жадный плюс)")
        System.out.println(str2);

        StringBuilder stringbuilder = new StringBuilder(str2);

        for (int i = 1; i < stringbuilder.length(); i++) {
            if(str2.charAt(i) >= 'А' && str2.charAt(i) <= 'Я'){
                stringbuilder.setCharAt(i-1, '.');
                stringbuilder.setLength(55);
                stringbuilder.insert(i, ' ');

                //stringbuilder.insert(i, ' ');
            }
        }

        //stringbuilder.replace(17,18," ");
        System.out.println(stringbuilder);

//        for (int i = str2.length()-1; i >=0; i--) {
//            if(str2.charAt(i) >= 'А' && str2.charAt(i) <= 'Я'){
//                stringbuilder.setCharAt(i-1, '.');
//                stringbuilder.insert(i, ' ');
//            }
//        }


//        stringbuilder.delete(0, 2); // Удаляются ". "
//        stringbuilder.append('.'); // Присоединяется '.'
//        System.out.println(stringbuilder.toString());



//        for (int i = 0; i < stringbuilder.length(); i++) {
//            if(stringbuilder.charAt(i) == '.'){
//
//            }
//
//        }
//        System.out.println(stringbuilder);

    }

}

