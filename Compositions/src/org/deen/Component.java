package org.deen;

public class Component {
    private String componentManufacturer;
    private String modelName;

    Component(String componentManufacturer, String modelName) {
        this.componentManufacturer = componentManufacturer;
        this.modelName = modelName;
    }

    public void display() {
        System.out.println("Manufacturer: " + componentManufacturer);
        System.out.println("Model: " + modelName);
    }

}
