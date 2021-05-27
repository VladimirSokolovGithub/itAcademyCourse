package ru.sokolov.lesson_6;

public class MainProject {
    public static void main(String[] args) {
        AbstractClassAnimalProject[] mass = {new CatProject("Barsik",250), new DogProject("Bobick", 300)};
        float dist = 270;

        for (int i = 0; i < mass.length; i++) {
            String nameStr = mass[i].getType() + " " + mass[i].getName();
            String event = String.format(" run max %.1f m. Tried to run %.1f ", mass[i].getMaxRun(), dist);

            System.out.println(nameStr + event + ((mass[i].run(dist)) ? "succeed" : "fails"));
        }
    }
}
