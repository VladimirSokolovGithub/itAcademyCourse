package ru.sokolov.lesson_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MainCollections {
    public static void main(String[] args) {

        /*
        //создание и копирование одного массива в другой большей длинны
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[6];
        System.arraycopy(arr, 0 , arr2, 0, arr.length);
        System.out.println(Arrays.toString(arr2));

         */

//        int[] array = new int[5];
//        System.out.println(array.length);

        //ArrayList работает только с ссылочными типами, с примитивными типами он не работает
        //В основе ArrayList лежит массив
        ArrayList<Integer> ai = new ArrayList<>();
        ai.ensureCapacity(1500);//можно емкость установить позже с помощью метода .ensureCapacity

        System.out.println(ai.size() + " ai");
        ai.add(1);
        ai.add(2);
        System.out.println(ai.size() + " ai");
        ai.add(3);
        ai.add(4);
        System.out.println(ai.size() + " ai");

        ai.remove(1); //удаляет второй элемент из коллекции
        //метод .remove удаляет элементы из ArrayList:
        // есть 2 варианта: 1-й удаление по индексу
        ai.remove((Integer) 3 ); //2-й вариант можно удалить сам объект. В данном случае удаляем целое число 3
        //важно заметить не содержимое 4-й ячейки под индексом 3, а именно цифру 3 в ячейке под индексом 2

        System.out.println(ai.size() + " ai");

        ai.trimToSize();//метод .trimToSize() удаляет все выделенные но не используемые ячейки из ArrayList

        System.out.println(ai.get(1));//у коллекции есть метод .get, который возвращает эллемент с определенным индексом

        if (ai.contains(1)) System.out.println(true);//метод .contains позволяет искать конкретное значение в коллекции в нашем случае цифру "1"

        System.out.println(ai);

//        ArrayList<Integer> arLi = new ArrayList<>(1000);//Можно сразу установить емкость ArrayList
//                                                                    // на нужное начальное количество элементов(ячеек)
//        arLi.ensureCapacity(1500); //можно емкость установить позже с помощью метода .ensureCapacity


        //Удаление объектов в коллекции ArrayList
        ArrayList<String> list = new ArrayList<>();

        list.add("Германия");
        list.add("Германия");
        list.add("Италия");
        list.add("Испания");
        list.add("Россия");

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equalsIgnoreCase("Германия")){
                list.remove(i);
                i--;//если нашли совпадение, то сделать шаг назад.
            }
        }

        System.out.println(list);// Как видим одна Германия удалилась вторая осталась

        //Проведём небольшой эксперимент и поставим одну Германию в конец списка


        ArrayList<String> list_1 = new ArrayList<>();

        list_1.add("Германия");
        list_1.add("Италия");
        list_1.add("Испания");
        list_1.add("Россия");
        list_1.add("Германия");

        for (int i = 0; i < list_1.size(); i++) {
            if(list_1.get(i).equalsIgnoreCase("Германия")){
                list_1.remove(i);
            }
        }

        System.out.println(list_1);//как видим теперь Германия удалилась полностью
        /* Это произошло потому, что как только мы нашли первое соответствие для удаления в нашем случае
        это Германия под индексом ноль, все остальные элементы начали смещаться влево и соответственно
        поменяли свои индексы.
         */

        //Интерфейс - это некий объект, который со 100% вероятностью нам гарантирует что он
        //пройдет по всем элементам нашей коллекции.
        /* Использование цикла в вышеприведенных примерах является плохой практикой. Необходимо использовать
        Iterator(Итератор). Рассмотрим пример ниже.
         */

        ArrayList<String> list_2 = new ArrayList<>();

        list_2.add("Германия");
        list_2.add("Германия");
        list_2.add("Испания");
        list_2.add("Россия");
        list_2.add("Италия");

        Iterator<String> iter = list_2.iterator();
        while (iter.hasNext()) {  //метод .hasNext() возвращает значение true или false в зависимости от того
                                  // что есть ли у нас хотя бы один не пройденный элемент. Если есть хотя бы один
                                  // не пройденный элемент возвращается значение true, если нет то false
            //System.out.println(iter.next());//выведем все элементы нашей коллекции используя метод .next()
            if (iter.next().equalsIgnoreCase("Германия")) {
                iter.remove();
            }
        }
        System.out.println(list_2);

        //Коллекция LinkedList (связанный список)
        //В основании LinkedList массива нет
        //при удалении элемента смещение индексов не происходит, а удаляются две связанные ссылки и создается новая ссылка
        //плюс LinkedList при удалении элементов, в том что нам не нужно будет смещать элементы в лево.
        //минус в процессе поиска элементов. Он осуществляется с помощью метода equals. А метод equals работает дольше
        // чем поиск по индексу.
        // так же LinkedList используется в очередях LIFO и FIFO
        LinkedList<String> ll = new LinkedList<>();
        ll.add("a");
        ll.add("b");

        ll.addFirst("z");
        ll.addLast("y");

        ll.add(1, "i");
        ll.remove(1);

        ll.removeFirst();
        ll.removeLast();

        String res = ll.pollFirst();

        System.out.println(ll + " " + res);

    }
}
