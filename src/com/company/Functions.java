package com.company;

public class Functions {

    public static void main(String[] args) {
        helloWorld();
        helloWorldWithParams("Enzo");
        helloWorldWithParams("Nicolás");
    }

    private static void helloWorld() {
        System.out.println("Hello world");
        System.out.println("Hello world 2");
    }

    private static String helloWorldReturnString() {
        String name = "Enzo";
        return name;
    }

    private static void helloWorldWithParams(String name) {
        System.out.println("Hello " + name);
    }
}