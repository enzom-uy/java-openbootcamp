package com.company;

/**
 * A Java Class is a representation of "something" in the code. It can be something real, like a Car,
 * or something more abstract or non-visible like a User in a database.
 */
public class Car {
    // Attributes: all the features that (in this case) a Car has, and may vary between other cars.
    String color;
    String manufacturer;
    String model;
    Double weight;
    Double longitude;
    Integer velocity = 0;

    // Constructors: special methods that will allow us to create new Cars.
    public Car(String color, String manufacturer, String model, Double weight, Double longitude) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
        this.longitude = longitude;
    }

    // Behavior: methods related to the class.
    public void accelerate(Integer velocity) {
        if (velocity > 0) {
            this.velocity += velocity;
        }
    }

    /* Usually there is a toString method to print all the Class attributes. */
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", longitude=" + longitude +
                ", velocity=" + velocity +
                '}';
    }
}
