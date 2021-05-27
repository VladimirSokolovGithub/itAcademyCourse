package ru.sokolov.lesson_5;

import java.util.Arrays;

public class Incapsulation {
    private String[] students = {"Petr", "Ivan", "Maksim"};

    public String[] getStudents() {
        String[] copyStudents = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            copyStudents[i] = students[i];
        }
        return copyStudents;
    }

    public void info() {
        System.out.println(Arrays.toString(students));
    }
}

class MainIncapsulation {
    public static void main(String[] args) {
        Incapsulation in = new Incapsulation();
        String[] mass =  in.getStudents();
        mass[1] = "lsghshg";
        in.info();

    }
}
