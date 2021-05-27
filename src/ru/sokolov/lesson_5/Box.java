package ru.sokolov.lesson_5;

public class Box {
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0){
            this.weight = weight;
        } else {
            System.out.println("вес не может быть отрицательным");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tools getTools() {
        return tools;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    private int weight;
    private String name;
    private Tools tools;

    public Box(int weight, String name) { //явный конструктор это специализированный метод, который позволяет
        this.weight = weight;             //инициализировать объект в момент его создания
        this.name = name;                 //ключевое слово this - это ссылка на текущий объект
    }

    public Box(String name) {       //создаём перегрузку конструктора, путём добавления нового конструктора с одним параметром
        this.name = name;
    }

    void testBox(){
        tools.test(this);
    }

    /*
//неявный конструктор создаётся у любого объекта по умолчанию
    public Box() {

    }
*/
}


