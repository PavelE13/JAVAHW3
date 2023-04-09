package JAVAHW3;

import java.util.ArrayList;

public class zad3 {
    /*Задача №2. Пусть дан произвольный список целых чисел, удалить из него чётные числа*/
    public static void deleteElem(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(24);
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(9);

        System.out.println("Список до изменения: " + list);

        deleteElem(list);

        System.out.println("Список после изменения: " + list);
    }
}
