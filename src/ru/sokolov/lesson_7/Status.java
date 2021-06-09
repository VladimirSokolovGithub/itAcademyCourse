package ru.sokolov.lesson_7;

public enum Status {
    SUCCESS("успешно"), ERROR("ошибка");

    private String rus;

    Status(String rus) {
        this.rus = rus;
    }

    public String getRus() {
        return rus;
    }
}

class MainEnum{
    public static void main(String[] args) {
        //Status.ERROR
        //стандартные основные методы enum - ов
        //Status.values();//возвращает список всех енумов
        //Status.valueOf("ERROR");//возвращает конкретный енум
//        Status.ERROR.ordinal();//возвращает порядковый номер в коллекции
//        System.out.println(Status.valueOf("ERROR"));
//        System.out.println(Status.ERROR.ordinal());

        System.out.println(Status.ERROR + " " + Status.ERROR.getRus());

    }
}
