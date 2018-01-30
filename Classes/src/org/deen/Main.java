package org.deen;

public class Main {

    public static void main(String[] args) {

        // Creating new instances
        Car porscheCar = new Car();
        Car holdenCar = new Car();

        // Using setter method
        porscheCar.setModelName("Carrera");

        // Using a getter method
        System.out.println("It's a Porsche " + porscheCar.getModelName());

        holdenCar.setModelName("Alpha");
        System.out.println("It's a Holden " + holdenCar.getModelName());

        // Creating a car using constructors
        Car bugattiVeyron = new Car(2, 4, "Bugatti Veyron", "Chrome", "W8");
        bugattiVeyron.display();
        
        // Creating a Generic car using empty constructor
        Car thatUglyCar = new Car();
        thatUglyCar.display();
    }
}
