package ru.sokolov.lesson_6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Animal("name1"), new Cat("name2", "red"),
                new SuperCat("name3", "black", 9)};

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

//        Animal animal = new Animal("name1");
//        animal.info();
//
//        Cat cat = new Cat("name2", "red");
//        cat.info();
//
//        SuperCat superCat = new SuperCat("name3", "black", 9);
//        superCat.info();
    }
}
