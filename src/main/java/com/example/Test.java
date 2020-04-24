package com.example;

public class Test {

    public static void main(String[] args) {
        printValue(10);
    }

    private static void printValue(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            pintinline(i);
        }
    }

    private static void pintinline(int i) {
        for (int k = 0; k < i + 1; k++) {
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println();
    }
}
