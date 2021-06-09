package ru.sokolov.lesson_6.home_work;

class Square extends Shape implements BuildMaterial{
    public void draw() {
        System.out.println("Квадрат");
    }

    @Override
    public void build() {
        System.out.println("Строим Квадрат");
    }
}

