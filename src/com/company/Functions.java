package com.company;

public class Functions {

    public static void main(String[] args) {
        helloWorld();
        helloWorldWithParamsPrivate("Enzo");
        helloWorldWithParamsPublic("Nicolás");
    }

    private static void helloWorld() {
        System.out.println("Hello world");
        System.out.println("Hello world 2");
    }

    private static String helloWorldReturnString() {
        String name = "Enzo";
        return name;
    }

    // This function can be used only inside the context of this class (Functions).
    private static void helloWorldWithParamsPrivate(String name) {
        System.out.println("Hello " + name);
    }


    // This function can be used outside the context of this class (Functions) and package (com.company).
    public static void helloWorldWithParamsPublic(String name) {
        System.out.println("Hello " + name);
    }


    // This function can be used only in the context of this package (com.company), and child classes.
    // This option is more oriented to when we have more classes and child classes.
    protected static void helloWorldWithParamsProtected(String name) {
        System.out.println("Hello " + name);
    }

    // This function can be used only in the context of this package (com.company).
    static void helloWorldWithParams(String name) {
        System.out.println("Hello " + name);
    }

    // METHOD OVERLOADING
    // Method overloading is when we have two methods/functions with identical names, but different parameters.

    private static void aMethod() {
        System.out.println("Method without params.");
    }

    private static void aMethod(String name) {
        System.out.println("Method with param(s): ", name);
    }
}