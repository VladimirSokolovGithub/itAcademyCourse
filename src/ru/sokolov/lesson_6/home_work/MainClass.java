package ru.sokolov.lesson_6.home_work;

public class MainClass {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        Shape[] shapes = {square, circle, triangle};
        for (int i = 0; i < shapes.length; i++) {
           shapes[i].draw();
//               square.draw();
//               square.build();
//               circle.draw();
//               circle.build();
//               triangle.draw();
//               triangle.build();

//            System.out.println("Нехватка материалов, дом не строится");
        }

    }
}
