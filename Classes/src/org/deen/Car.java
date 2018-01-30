package org.deen;

public class Car {

    private int numberOfDoors;
    private int numberOfWheels;
    private String modelName;
    private String carColor;
    private String engineType;

    Car(int numberOfDoors, int numberOfWheels, String modelName, String carColor, String engineType) {
        // Never use getters/setters in constructors
        // This may lead to uninitialized fields
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        this.modelName = modelName;
        this.carColor = carColor;
        this.engineType = engineType;
    }

    Car() {
        // this can also be used to call constructors
        this(4, 4, "Generic Model", "Black", "V2");
        System.out.println("Created a generic class instance.");
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCarColor() {
        // this is not necessary if there aren't any local or global variable with the same name
        // and the method is not static
        return carColor;
    }

    public void setCarColor(String carColor) {
        // this points to the instance of the object
        this.carColor = carColor;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumberOfDoors() {

        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void display() {
        System.out.println("Model: " + modelName + '\n' +
                "Number of doors: " + numberOfDoors + '\n' +
                "Number of tyres: " + numberOfWheels + '\n' +
                "Color: " + carColor + '\n' +
                "Engine: " + engineType);
    }

}
