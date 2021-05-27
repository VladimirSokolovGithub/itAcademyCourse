package ru.sokolov.lesson_5.home_work_worker;

public class Worker {
    private String fio;
    private int salary;
    private int age;

    protected Worker(String fio, int age, int salary){
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "ФИО='" + fio + '\'' +
                ", Зарплата=" + salary +
                ", Возраст=" + age +
                '}';
    }
}
