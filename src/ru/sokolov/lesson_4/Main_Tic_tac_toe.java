package ru.sokolov.lesson_4;

import java.util.Random;
import java.util.Scanner;

//Пишем игру крестики - нолики (поле 3 x 3)
public class Main_Tic_tac_toe {
    public static void main(String[] args) {
        initGameField();
        printGameField();

        while (!checkGameFieldFull()){
            playerStep();
            printGameField();

            if(checkWinnable(PLAYER)){
                System.out.println("Победил игрок");
                break;
            }

            if(checkGameFieldFull()){
                System.out.println("Ничья!");
                break;
            }

            pkStep();
            printGameField();

            if(checkWinnable(PC)){
                System.out.println("Победил компьютер");
                break;
            }

            if(checkGameFieldFull()){
                System.out.println("Ничья!");
                break;
            }
        }
    }



    static int COLUMN_NUMBER = 3;//кол-во столбцов в массиве
    static int ROU_NUMBER = 3;//кол-во строк в массиве

    static char[][] GAME_FIELD = new char[ROU_NUMBER][COLUMN_NUMBER]; //создаём игровое поле 3 x 3

    //Создаём фишки игрока и компьютера, то чем будем ходить и пустую ячейку
    static char PLAYER = 'x';
    static char PC = 'o';
    static char EMPTY = '*';

    static Scanner scanner = new Scanner(System.in); //создадим сканер для ввода координат хода Игрока
    static Random random = new Random(); //создадим рандом для ввода координат хода компьютера

    //Создадим метод initGameField, который будет заполнять наше игровое поле
    public static void initGameField() {
        for (int i = 0; i < ROU_NUMBER; i++) {
            for (int j = 0; j < COLUMN_NUMBER; j++) {
                GAME_FIELD[i][j] = EMPTY;//Присваиваем пустой элемент нашему полю в каждую координату i и j

            }
        }
    }

    //Создадим метод который будет выводить наше игровое поле создаваемое методом initGameField в консоль
    public static void printGameField(){
        System.out.println("_______");
        for (int i = 0; i < ROU_NUMBER; i++) {
            System.out.print("|");
            for (int j = 0; j < COLUMN_NUMBER; j++) {
                System.out.print(GAME_FIELD[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("_______");
    }

    //Создадим метод для хода игрока
    public static void playerStep(){
        int x, y;
        do {
            System.out.println("Введите координаты");
            x = checkLine(scanner.nextLine()) - 1;//минус один нужен для того что бы при вводе пользователь начинал
                                                  //ввод координат с цифры один (1) а не с ноля (0) как начального  индекса в массиве
            y = checkLine(scanner.nextLine()) - 1;
        } while (x < 0 || y < 0 || x > ROU_NUMBER - 1 || y > COLUMN_NUMBER - 1 || GAME_FIELD[x][y] != EMPTY );
        /* while говорит о том,что игрок ходит пока выполняются условия: если "x" меньше ноля то есть нижней границы поля,
        то данные введены не правильно, то же самое для "y", далее если "x" больше чем верхня граница то данные введены не правильно,
        если "y" больше чем верхня граница то данные введены не правильно, если место игрового поля не пустое (уже занято предыдущим
         ходом, то данные введены не правильно. Соответственно пользователь должен ввести новое значение).
         */
        GAME_FIELD[x][y] = PLAYER;
    }

    //Создадим метод для хода компьютером
    public static void pkStep(){
        int x, y;
        do {
            System.out.println("Ход PС");
            x = random.nextInt(ROU_NUMBER);
            y = random.nextInt(COLUMN_NUMBER);
        } while (x < 0 || y < 0 || x > ROU_NUMBER - 1 || y > COLUMN_NUMBER - 1 || GAME_FIELD[x][y] != EMPTY );
        GAME_FIELD[x][y] = PC;
    }

    //Создадим метод проверки победы по линиям строк, столбцов и диагоналей
    public static boolean checkWinnable(char symbol){
        //проверка строк

        if(GAME_FIELD[0][0] == symbol && GAME_FIELD[0][1] == symbol && GAME_FIELD[0][2] == symbol){
            return true;
        }
        if(GAME_FIELD[1][0] == symbol && GAME_FIELD[1][1] == symbol && GAME_FIELD[1][2] == symbol){
            return true;
        }
        if(GAME_FIELD[2][0] == symbol && GAME_FIELD[2][1] == symbol && GAME_FIELD[2][2] == symbol){
            return true;
        }
        //проверка столбцов
        if(GAME_FIELD[0][0] == symbol && GAME_FIELD[1][0] == symbol && GAME_FIELD[2][0] == symbol){
            return true;
        }
        if(GAME_FIELD[0][1] == symbol && GAME_FIELD[1][1] == symbol && GAME_FIELD[2][1] == symbol){
            return true;
        }
        if(GAME_FIELD[0][2] == symbol && GAME_FIELD[1][2] == symbol && GAME_FIELD[2][2] == symbol){
            return true;
        }
        //проверка диагоналей
        if(GAME_FIELD[0][0] == symbol && GAME_FIELD[1][1] == symbol && GAME_FIELD[2][2] == symbol){
            return true;
        }
        if(GAME_FIELD[0][2] == symbol && GAME_FIELD[1][1] == symbol && GAME_FIELD[2][0] == symbol){
            return true;
        }
        return false;
    }


    //Создадим метод проверки на ничью
    public static boolean checkGameFieldFull(){
        for (int i = 0; i < ROU_NUMBER; i++) {
            for (int j = 0; j < COLUMN_NUMBER; j++) {
                if(GAME_FIELD[i][j] == EMPTY){
                    return false; // Если есть хотя бы одна пустая ячейка т.е. поле не заполнено, то возвращается false
                }
            }
        }
        return true; // Если нет пустой ячейки т.е. поле полностью заполнено, то возвращается true
    }

    //Создаем метод проверки если пользователь введет не число
    public static int checkLine(String line){
        try {
            return Integer.parseInt(line);
        } catch (Exception e) {
            throw new RuntimeException("Нужно вводить число!");
        }
    }


}
