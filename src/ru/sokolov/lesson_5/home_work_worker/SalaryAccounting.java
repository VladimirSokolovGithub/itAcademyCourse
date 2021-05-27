package ru.sokolov.lesson_5.home_work_worker;

import java.util.Arrays;

public class SalaryAccounting {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Казаков Артур Борисович", randomInt(18,65), randomInt(10000, 50000));
        Worker worker2 = new Worker("Соловьев Инокентий Олегович", randomInt(18,65), randomInt(10000, 50000));
        Worker worker3 = new Worker("Савушкин Артём Владимирович", randomInt(18,65), randomInt(10000, 50000));
        Worker worker4 = new Worker("Бессмертная Валентина Ивановна", randomInt(18,65), randomInt(10000, 50000));
        Worker worker5 = new Worker("Кривошеенко Сергей Андреевич", randomInt(18,65), randomInt(10000, 50000));
        Worker worker6 = new Worker("Соколова Юлия Викторовна", randomInt(18,65), randomInt(10000, 50000));
        Worker worker7 = new Worker("Соколов Владимир Олегович", randomInt(18,65), randomInt(10000, 50000));



        Worker[] workers = new Worker[]{worker1, worker2, worker3, worker4, worker5, worker6, worker7};

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() > 30000 ) {
                System.out.println(workers[i].toString());
            }
        }

    }

    static int randomInt(int from, int to) {
        return (int)(Math.random() * (to - from + 1) + from);
    }

}
