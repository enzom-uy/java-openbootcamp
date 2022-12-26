package com.company;

public class Switch {
    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("The weather is sunny.");
                break;
            case "cloudy":
                System.out.println("The weather is cloudy.");
                break;
            default:
                System.out.println("We couldn't analyze the weather.");
                break;
        }
    }
}
