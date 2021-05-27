package ru.sokolov.lesson_6;

public class DogProject extends AbstractClassAnimalProject implements Several {
    public DogProject(String name, float maxRun) {
        super("Dog", name, maxRun);
    }

    @Override
    public boolean check() {
        return false;
    }
}
