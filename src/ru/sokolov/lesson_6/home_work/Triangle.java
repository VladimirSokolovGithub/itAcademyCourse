package ru.sokolov.lesson_6.home_work;

class Triangle extends Shape implements BuildMaterial{
    public void draw() {
        System.out.println("Треугольник");
    }

    @Override
    public void build() {
        System.out.println("Строим Треугольник");
    }
}
