package ru.sokolov.lesson_6;

public class Cat extends Animal {

    protected String color;
    protected int z;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public void info() {
        System.out.println("Cat " + name + " " + color);
    }

    @Override
    public void voice(){
        System.out.println("Cat say");
    }
}
