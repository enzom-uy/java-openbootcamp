package com.company;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            count++;

            // Skip this iteration
            if (count == 6) continue;

            // Stop the while loop when this condition is true
            if (count == 8) break;

            System.out.println("is true" + count);

        }
        System.out.println("End");
    }
}
