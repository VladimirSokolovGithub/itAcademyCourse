package ru.sokolov.lesson_6;

// Разница между интерфейсами и абстрактными классами именно логическая а не синтаксическая
// И Базовый клас для наследования должен быть только один а подписываться можно на неопределенное кол-во интерфейсов
public interface Several {
    boolean check();

    // статичные и дефолтные методы можно использовать в интерфейсах, но на практике это не используется
    // так как интерфейс это всегда что то максимально абстрактное и не привязанное к реализации
    static void info(){

    }

    default void test(){

    }
}
