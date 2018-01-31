package org.deen;

public class PCCase extends Component {
    private int powerSupplyInVolts;
    private Dimension dimension;

    PCCase(String componentManufacturer, String modelName, int powerSupplyInVolts, Dimension dimension) {
        super(componentManufacturer, modelName);
        this.powerSupplyInVolts = powerSupplyInVolts;
        this.dimension = dimension;
    }

    PCCase() {
        this("Generic Case Manufacturer",
                "CASE-ABC",
                500,
                new Dimension(50, 100, 200));
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Power Supply: " + powerSupplyInVolts);
        dimension.display();
    }

    public void powerON() {
        System.out.println("Turning ON the PC!");
    }
}

class Dimension {
    private int heightInCM;
    private int widthInCM;
    private int depthInCM;

    Dimension(int heightInCM, int widthInCM, int depthInCM) {
        this.heightInCM = heightInCM;
        this.widthInCM = widthInCM;
        this.depthInCM = depthInCM;
    }

    public void display() {
        System.out.println("Dimensions: " +
                heightInCM + "x" +
                widthInCM + "x" +
                depthInCM);
    }
}
