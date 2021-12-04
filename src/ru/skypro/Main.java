package ru.skypro;
import java.util.Arrays;

public class Main {
     public static void main(String[] args) {
         int[] arr = generateRandomArray();
         HomeWork6Easy1();
         HomeWork6Easy2();
         HomeWork6Easy3();
         HomeWork6Easy4();

     }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void  HomeWork6Easy1() {
        //        HomeWork6Easy1();
        System.out.println("HomeWork6. Exercise 1.");
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i: arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей");
    }

    public static void  HomeWork6Easy2() {
        //        HomeWork6Easy2();
        System.out.println("HomeWork6. Exercise 2.");
        int[] arr = generateRandomArray();
        int min = arr [0];
        int max = arr [0];

        for (int i: arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная трата за день составила: " + min + " рублей");
        System.out.println("Максимальная трата за день составила: " + min + " рублей");
    }
    public static void  HomeWork6Easy3() {
        //        HomeWork6Easy3();
        System.out.println("HomeWork6. Exercise 3.");
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i: arr) {
            sum += i;
        }
        System.out.println(sum / (float) arr.length);
    }
    public static void  HomeWork6Easy4() {
        //        HomeWork6Easy4();
        System.out.println("HomeWork6. Exercise 4.");
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }

}

