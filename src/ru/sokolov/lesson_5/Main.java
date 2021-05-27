package ru.sokolov.lesson_5;

public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss("boss1", 10);
        Boss boss2 = new Boss("boss2", 20);
        boss1.tools = "tools1";

        System.out.println(boss1.tools);
        System.out.println(boss2.tools);

        System.out.println(Boss.tools);


//   Box box1 = new Box(10, "box1");
//   box1.setWeight(50);
//   box1.setWeight(70);

//    Tools tools = new Tools();
//    box1.tools = tools;
//    box1.testBox();

    //tools.test(box1);

    //Box box2 = new Box("box_name_1");
/*        Box box1 = new Box(10, "box1");
        Box box2 = new Box(15,"box2");
*/

/*        Box box1 = new Box(); //создаем объект box1
        System.out.println(box1); //выводим в консоль ссылку в памяти на объект box1

        box1.name = "box1";
        box1.weight = 10;

        Box box2 = new Box();//создаем объект box1
        System.out.println(box2);//выводим в консоль ссылку в памяти на объект box2

        box1 = box2;//присваиваем объекту box1, объект box2 т.е. теперь у объекта box1 будет такая же ссылка как и у объекта box2
        System.out.println(box2);

        box2.name = "box2";
        box2.weight = 15;

        box1.name = "проверка box1";
        box2.name = "проверка box2";
*/

    //System.out.println(box1.name + " " + box1.weight);
    //System.out.println(box2.name + " " + box2.weight);

    //System.out.println(calcNumbers(2,3, 5));
}

 /*   static int calcNumbers(int a, int b){
        return a + b;
    }

    //перегрузка метода
    static int calcNumbers(int a, int b, int c){
        return a + b + c;
    }
*/

    //подход аргумента переменной длинны вместо перегрузки метода
    static int calcNumbers(int... mass){
        int res = 0;
        for (int i = 0; i < mass.length; i++) {
            res += mass[i];
        }
        return res;
    }
}
