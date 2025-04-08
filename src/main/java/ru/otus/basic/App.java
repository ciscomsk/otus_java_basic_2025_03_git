package ru.otus.basic;

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        task2();
    }

    public static void doSomething() {
        System.out.println("---");
        System.out.println("Q");
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
        System.out.println(-2);
        System.out.println("B");
        System.out.println("A");
        System.out.println("---");
    }

    public static void task2() {
        System.out.println("- - -");
        System.out.println();
        System.out.println("-   -");
        System.out.println();
        System.out.println("- - -");

        int a = 0;
        int b = 0;
        a++;
        b += a;
        System.out.println(a + b);
    }
}
