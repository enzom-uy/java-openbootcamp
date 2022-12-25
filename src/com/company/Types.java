package com.company;

public class Types {
    public static void main(String[] args) {
        // Data types structure: type identifier = value;
        // You can also do: type identifier; and then in another line: identifier = value;

        // PRIMITIVES (can't be null):

        // Integers:
        // Most of the time people use int and long because of their capacity.
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 bytes
        int number3 = 3; // 4 bytes
        long number24 = 4; // 8 bytes

        // Floats:
        float decimal1 = 4.9f;
        double decimal2 = 9.9d;

        // Character:
        char character = 'a';

        // Boolean:
        boolean isTrue = true;
        boolean isFalse = false;

        // WRAPPER CLASSES (can be null):

        // Strings:
        String name = "Enzo";
        String lastname = "Muñoz";

        // Integers
        Integer number = null;
        Long wrappedClassNumber2 = 2l;
    }
}
