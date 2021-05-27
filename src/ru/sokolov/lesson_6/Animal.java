package ru.sokolov.lesson_6;

public class Animal {
    protected String name;
    protected int z;

    public Animal(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Animal " + name);
    }

    public void voice(){
        System.out.println("Animal say");
    }
}
