package JAVAHW3;

import java.util.Arrays;

public class zad1 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        /* Задача №1. Реализовать алгоритм сортировки выборкой (перебором) */
        int[] arr = {25, 13, 9, 4, 6, 7};
        System.out.println("Массив до сортировки: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Массив после сортировки: " + Arrays.toString(arr));
    }
}
