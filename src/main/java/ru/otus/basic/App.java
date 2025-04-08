package ru.otus.basic;

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        doSomething();
    }

    public static void doSomething() {
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
    }
}
