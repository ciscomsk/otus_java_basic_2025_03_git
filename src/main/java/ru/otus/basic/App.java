package ru.otus.basic;

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        task2();
    }

    public static void doSomething() {
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
        System.out.println(-2);
    }

    public static void task2() {
        System.out.println("- - -");
        System.out.println();
        System.out.println("-   -");
        System.out.println();
        System.out.println("- - -");

        int a = 1;
        a++;
        System.out.println(a);
    }
}
