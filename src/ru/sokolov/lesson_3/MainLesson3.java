package ru.sokolov.lesson_3;
//Создание и применение массивов, работа с циклами
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainLesson3 {

    //static Scanner sc = new Scanner(System.in); // выносим Scanner как поле класса для возможности
                                                // использования его в любом месте класса
// Scanner способен считывать данные не только с консоли но и из файла,
// из сети при работе по протоколу tcp ip

    static Random random = new Random();

    public static void main(String[] args) {
/* Для парсинга используются регулярные выражения или split */

        /*
        int a = sc.nextInt(); //метод считывает целое число
        String b = sc.nextLine(); //метод считывает всю строку
        String c = sc.next(); //метод считывает строку до пробела
        //В данном виде, при вводе строки Hello world, код не отработает нормально сожрет второе слово world,
        //так как после нажатия на Enter команда String b = sc.nextLine(); считывает пустую строку b = ""
        //неявный(невидимый нам) символ \n - перевод каретки(символ перехода на новую строку)
        // следующая команда String c = sc.next(); считывает слово Hello до пробела и записывает его в переменную "с".


        System.out.println(a + " " + b + " " + c);
        */

        // getNumberFromScanner("Введите значение от 5 до 10", 5, 10);

        //форматированный вывод
        //Очень часто форматированный вывод используется для формирования SQL запросов
        /*
        String res = String.format("Строка %s дробь %.2f дробь %d символ %c", "Java", 4.5f, 55, 'y');
        System.out.println(res);
         */

        // getSql("Bob");

        // Клас Random - генерация псевдослучайных чисел
        /*
        //Random random = new Random();
        System.out.println(random.nextInt());//в нашем случае всё что попадает в размер int рандомно генерируется
        System.out.println(random.nextInt(9));// будет выводить значения от 0 до 9, где 0 входит а 9 не входит в диапазон
        System.out.println(random.nextInt(30) - 10);// будет выводить значения от -10 до 30, верхнюю границу
        //мы указываем это 30, нижняя граница у нас в этом случае автоматически выставляется на ноль и от
        // нижней границы 0 мы отнимаем 10 и получаем нижнюю границу минус 10
        */

        //Напишем код который из массива строк вытаскивает случайные значения
        /*
        //Random random = new Random();
        String[] colors = {"Red", "Green"};
        int pos = random.nextInt(colors.length);
        System.out.println(colors[pos]);
        */

        //System.out.println(Arrays.toString(getTicket()));

        //isGame();//////////////

        //Извлечение данных из файла
        /*
        File file = new File("C:\\testData\\test.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);// здесь Scanner впитал в себя данные из файла
            //теперь мы должны извлечь эти данные с помощью цикла
            while (sc.hasNextLine()){ //звучит это так - если там есть ещё одна строка то возвращается true
                                      //если нет строки то false
                String line = sc.nextLine();
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
        */

        /*
        // Работа со строками
        //StringBuffer - брат близнец StringBuilder но только он потокобезопасный
        //он используется при работе с потоками
        StringBuilder stringBuilder = new StringBuilder("Java");
        char c = stringBuilder.charAt(0);
        System.out.println(c);

        stringBuilder.setCharAt(0, 'y');
        System.out.println(stringBuilder);

        stringBuilder.append("Best");
        stringBuilder.append("Language");

        System.out.println(stringBuilder);
        */
/*
        StringBuilder stringBuilder = new StringBuilder("Java Hello");
//        stringBuilder.delete(0, 2); // метод delete удаляет указанные символы от и до указанных индексов,
//                                    // причем последний индекс не входит то есть от 0 до 2 удаляет 0-й и 1-й индекс
//        System.out.println(stringBuilder);

        //метод substring()
//        String str1 = stringBuilder.substring(5);//на выходе получиться слово Hello т.е метод обрезал
//                                                      // с нулевого по четвертый индекс
//        System.out.println(str1);
//
//        String str2 = stringBuilder.substring(2, 7);
//        System.out.println(str2);

        stringBuilder.setLength(20); //метод setLength(20) изменяет длину
        stringBuilder.replace(2,7,"hhhh"); //метод вставляет новую строку в текущую со второго по седьмой индекс
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder); // выводит строку в обратном порядке
*/
        /*Есть какая-то строка в которой три предложения. Наша задача привести эту строку к нормальному виду
        что бы было предложение один. точка Предложение    два. точка   Предложение    три. точка
        и между словами должен быть только один пробел*/

        String res = "Предложение    один   Предложение    два   Предложение    три.";
        String res1 = res.replaceAll(" +", " "); //Метод replaceAll использует регулярные выражения
        //и говорит что нужно заменить там где больше одного пробела " +" на один пробел " "
        // (так же эта операция называется "Жадный плюс)")

        StringBuilder s2 = new StringBuilder(res1);
        for (int i = 1; i < s2.length(); i++) {
            if(res1.charAt(i) >= 'А' && res1.charAt(i) <= 'Я'){
                s2.setCharAt(i-1, '.');
            }
        }
        System.out.println(s2);

        // поговорим о методе System.out.println();
        int a = 10;
        int b = 10;
        String s = "result";

        System.out.println(a + b + s + a + b); //результат = 20result1010, это получается потому, что всё что идет
        // после строки метод автоматически приводит к строке. Если бы строки не было метод сложил бы все числа
        // а так он складывает только первых два числа

        //Строки нужно сравнивать с помощью метода equals. В классе String метод equals сравнивает не ссылки а значения
        // так как В классе String он переопределен из базового класса Object
        String str3 = "Hello";
        String str4 = "Hello";
        if (str3.equals(str4)){
            System.out.println("строки равны");
        }

        String str5 = "hello";
        String str6 = "Hello";
        if (str3.equalsIgnoreCase(str4)){ // метод игнорирует регистр
            System.out.println("строки равны");
        }


    }

    //Напишем программу где с помощью Randoma мы загадываем число от 1 до 10
    //и потом с помощью Scanner пользователь вводит значение и пытается угадать это число
/*
    public static void isGame(){
        int rand = random.nextInt(11) + 1;
        Boolean win = false;//создаем некий флаг который будет контролировать состояние игрока и изначально оно false
        int current;//создаем переменную в которую будем вводить числа из консоли
        int i;
        for (i = 1; i < 4; i++) {
            if(i == 1){
                System.out.println("Угадайте число у Вас 3 попытки");
            }
            current = sc.nextInt();
            if(current < rand){
                System.out.println("Число меньше загаданного");
            } else if(current > rand){
                System.out.println("Число больше загаданного");
            } else {
                System.out.println("Вы угадали");
                win = true;

                System.out.println("Повторить игру 1, выйти 0");
                current = sc.nextInt();

                if(current == 1){
                    i = 0;
                    win =false;
                    rand = random.nextInt(11) + 1;
                } else  if (current == 0){
                    break;
                }
            }
            //checkWin(current, i, win, rand);
        }
        if(!win && i == 3){
            System.out.println("Повторить игру 1, выйти 0");
            current = sc.nextInt();

            if(current == 1){
                i = 0;
                win =false;
                rand = random.nextInt(11) + 1;
            } else  if (current == 0) {
                break;
            }
        }


    }
*/
    //Метод для программы угадывания чисел - isGame
//    public static Boolean checkWin(int current, int i, Boolean win, int rand){
//        if(current == 1){
//            i = 0;
//            win =false;
//            rand = random.nextInt(11) + 1;
//        } else  if (current == 0){
//            break;
//        }
//
//    }


    //Напишем метод который формирует лотерейный билет из случайных чисел
    public static int[] getTicket(){
        int[] mass = new int[6];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(99) + 1; //+1 для того что бы не было нуля, т.е. нижняя граница начинается с 1
        }
        return mass;
    }


    // Пример метода с SQL запросом, который по имени вытащил из базы данных кол-во лет
    public static void getSql(String name){
        String sql = String.format("SELECT age FROM students where name = '%s", name);
        System.out.println(sql);
    }

/*
    public static int getNumberFromScanner(String msg, int min, int max){
        int x;

        do {
            System.out.println(msg);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
*/
}
