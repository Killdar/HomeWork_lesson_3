package ru.geekbrains.HomeWork_lesson_3;

import java.util.Arrays;

//Задача 1
public class Main {
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private  static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
    }

    //Задача 2
    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 1; i <= arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

    //Задача 3
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void main(String[] args)
    {
        int[] mass = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMass = mass.length;
        for(int i = 0; i < maxMass; i++) {
            if (mass[i] < 6) mass[i] = mass[i] * 2;
        }
        for(int i = 0; i < maxMass; i++)
        {
            System.out.print (i + "-" + mass[i] + " ");
        }
    }
    //Задача 4.
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами

    public static void main(String args[]) {
        int[][] sqr = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sqr[i][j] = (i == j || j == (3 - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqr[i][j]);
            }
            System.out.println();
        }}
    //Задача 5
    //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
        arr[i] = initialValue;
    }
    return arr;
    }
    //Задача 6
    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void main(String[] args) {
        int[] mas = {7, 5, 3, 2, 11, 4, 12, 2, 4, 8, 9, 1};
        int min = mas[0], max = mas[0], i, imin = 0, imax = 0;
        for (i = 0; i != mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                imin = i;
            }
            if (mas[i] > max) {
                max = mas[i];
                imax = i;
            }
            System.out.println("max = " + max + " min = " + min);
            System.out.println("imax = " + imax + " imin = " + imin);
        }
    }
    //Задача 7
    //7 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
    // вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
    // checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance
    // ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
    private static boolean checkBalance1(int[] arr) {

        int right = 0;
        int left = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            left += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                right += arr[j];
            }
            if (left == right) {
                return  true;
            }
            right = 0;
        }
        return  false;
    }

    //Задача 8
    //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
    // или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) ->
    // [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    private static void arrayShift(int[] arr, int shift) {
        System.out.println("Массив до сдвига:\t\t" + Arrays.toString(arr));
        System.out.println("Значение n = " + shift);

        int length = arr.length;

        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                int buffer = arr[length - 1];
                System.arraycopy(arr, 0, arr, 1, length - 1);
                arr[0] = buffer;
            }
        } else if (shift < 0) {
            for (int i = 0; i < -shift; i++) {
                int buffer = arr[0];
                System.arraycopy(arr, 1, arr, 0, length - 1);
                arr[length - 1] = buffer;
            }
        }
        System.out.print("Массив после сдвига:\t" + Arrays.toString(arr) + "\n\n");
    }



}



