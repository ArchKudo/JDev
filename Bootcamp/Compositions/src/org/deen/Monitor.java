package org.deen;

public class Monitor extends Component {
    private Resolution nativeResolution;
    private int refreshRateInHz;
    private double responseTime;

    Monitor(String componentManufacturer,
            String modelName,
            Resolution nativeResolution,
            int refreshRateInHz,
            double responseTime) {
        super(componentManufacturer, modelName);
        this.nativeResolution = nativeResolution;
        this.refreshRateInHz = refreshRateInHz;
        this.responseTime = responseTime;
    }

    Monitor() {
        this("Generic Display Manufacturer",
                "SCREEN-ABC",
                new Resolution(1920, 1080, false),
                60,
                2.0);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Aspect ratio: " + nativeResolution.getAspectRatio());
        System.out.println("Resolution: " +
                nativeResolution.getWidthInPixels() + "x" + nativeResolution.getHeightInPixels());
        System.out.println("Curved: " + (nativeResolution.isCurved() ? "Yes" : "No"));
        System.out.println("Refresh Rate: " + refreshRateInHz);
        System.out.println("Response Time: " + responseTime);
    }

    public void drawImage(String image) {
        System.out.println("Setting Aspect Ratio at: " + nativeResolution.getAspectRatio());
        System.out.println("Drawing Image: " + image);
    }
}

class Resolution {
    private int widthInPixels;
    private int heightInPixels;
    private boolean isCurved;

    Resolution(int widthInPixels, int heightInPixels, boolean isCurved) {
        this.widthInPixels = widthInPixels;
        this.heightInPixels = heightInPixels;
        this.isCurved = isCurved;
    }

    public int getWidthInPixels() {
        return widthInPixels;
    }

    public int getHeightInPixels() {
        return heightInPixels;
    }

    public boolean isCurved() {
        return isCurved;
    }

    public double getAspectRatio() {
        return (double) widthInPixels / (double) heightInPixels;
    }
}
