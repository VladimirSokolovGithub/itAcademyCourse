package ru.sokolov.lesson_6;

import java.util.Random;

public class AbstractClassAnimalProject {
    private String type;
    private String name;
    private float maxRun;

    private Random random = new Random();

    public AbstractClassAnimalProject(String type, String name, float maxRun) {
        float diff = random.nextFloat() * 20;

        this.type = type;
        this.name = name;
        this.maxRun = maxRun + diff;
    }

    protected boolean run(float dist) {
        return dist < maxRun;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(float maxRun) {
        this.maxRun = maxRun;
    }

}
