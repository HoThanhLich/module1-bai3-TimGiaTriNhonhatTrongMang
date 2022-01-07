package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 3, 4, 5, 7};
        int index = minValue(arr);
        System.out.println("Gia tri nho nhat trong mang la: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}