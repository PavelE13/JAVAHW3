package JAVAHW3;

import java.util.ArrayList;

public class zad4 {
    public static int findmin(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;//Присваиваем заведомо самое большое значение типа int для сравнения с ним
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int findmax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;//Присваиваем заведомо самое малое значение типа int для сравнения с ним
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static double findaver(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    public static void main(String[] args) {
    /* Задача №1. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(12);
    list.add(8);
    list.add(1);

    int min = findmin(list);
    int max = findmax(list);
    double aver = findaver(list);

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
    System.out.println("Average: " + aver);
    
    }
    
}
