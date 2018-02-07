package org.deen;

public class Computer {
    private String modelType;
    private int memory;
    private double processingPower;
    private boolean isHandheld;
    private String useCase;

    Computer(String modelType, int memory, double processingPower, boolean isHandheld, String useCase) {
        this.modelType = modelType;
        this.memory = memory;
        this.processingPower = processingPower;
        this.isHandheld = isHandheld;
        this.useCase = useCase;
    }

    private String getModelType() {
        return modelType;
    }

    private int getMemory() {
        return memory;
    }

    private double getProcessingPower() {
        return processingPower;
    }

    private boolean isHandheld() {
        return isHandheld;
    }

    private String getUseCase() {
        return useCase;
    }

    public void displaySpecs() {
        System.out.println();
        System.out.println(getModelType());
        System.out.println(getMemory());
        System.out.println(getProcessingPower());
        System.out.println(isHandheld());
        System.out.println(getUseCase());
        System.out.println();
    }
}
