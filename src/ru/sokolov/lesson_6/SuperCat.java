package ru.sokolov.lesson_6;

public class SuperCat extends Cat {

    protected int catLife;

    public SuperCat(String name, String color, int catLife) {
        super(name, color);
        this.catLife = catLife;
    }

    public void info() {
        super.z = 10;
        System.out.println("SuperCat " + name + " " + color + " " + catLife);
    }

    @Override
    public void voice(){
        System.out.println("SuperCat say");
    }

}
