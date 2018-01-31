package org.deen;

public class Motherboard extends Component {
    private boolean hasUEFI;
    private int numberOfRAMSlots;
    private int numberOfPCIESlots;

    Motherboard(String componentManufacturer, String modelName, boolean hasUEFI, int numberOfRAMSlots, int numberOfPCIESlots) {
        super(componentManufacturer, modelName);
        this.hasUEFI = hasUEFI;
        this.numberOfRAMSlots = numberOfRAMSlots;
        this.numberOfPCIESlots = numberOfPCIESlots;
    }

    Motherboard() {
        this("Generic Motherboard Manufacturer",
                "MOBO-XYZ",
                true,
                4,
                8);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("UEFI Enabled: " + (hasUEFI ? "Yes" : "No"));
        System.out.println("RAM Slots: " + numberOfRAMSlots);
        System.out.println("PCIE Slots: " + numberOfPCIESlots);
    }

    public void loadUtility(String programName) {
        System.out.println("Loading program " + programName + "...");
    }
}
