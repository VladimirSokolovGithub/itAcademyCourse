package ru.sokolov.lesson_6.home_work;

class Circle extends Shape implements BuildMaterial {
    public void draw() {
        System.out.println("Круг");
    }

    @Override
    public void build() {
        System.out.println("Строим Круг");
    }
}
