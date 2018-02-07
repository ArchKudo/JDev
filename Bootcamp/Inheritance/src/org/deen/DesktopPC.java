package org.deen;

public class DesktopPC extends Computer {
    private boolean usesSSD;
    private String OSType;
    private int numberOfPCIELanes;
    private String cpuManufacturer;

    DesktopPC(int memory, double processingPower,
              boolean usesSSD, String OSType, int numberOfPCIELanes,
              String cpuManufacturer) {
        super("Desktop PC", memory, processingPower, false,
                "Programming, Gaming, Video Creation, etc.");
        this.usesSSD = usesSSD;
        this.OSType = OSType;
        this.numberOfPCIELanes = numberOfPCIELanes;
        this.cpuManufacturer = cpuManufacturer;
    }

    private boolean isUsesSSD() {
        return usesSSD;
    }

    private String getOSType() {
        return OSType;
    }

    private int getNumberOfPCIELanes() {
        return numberOfPCIELanes;
    }

    private String getCpuManufacturer() {
        return cpuManufacturer;
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println(getCpuManufacturer());
        System.out.println(getNumberOfPCIELanes());
        System.out.println(getOSType());
        System.out.println(isUsesSSD());
        System.out.println();
    }
}
