package ru.sokolov.lesson_5;

public class Boss {
    String name;
    int weight;

    static String tools;

    public Boss(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    void info(){
        System.out.println(name + " " + weight);
    }
}
