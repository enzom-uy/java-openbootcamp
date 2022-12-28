package com.company;

public class CarMain {
    public static void main(String[] args) {
        // Here we're creating a new instance of a Class.
        Car carObj = new Car(
                "red",
                "honda",
                "civic",
                1430.45,
                5.4
        );

        carObj.accelerate(50);

        System.out.println(carObj);
    }
}
