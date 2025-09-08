package Assignment1;

public class Smartphone {
    private String screen;      // OLED или IPS
    private String processor;   // например, Snapdragon 8 Gen 2
    private int battery;        // mAh, например 5000
    private int camera;         // мегапиксели, например 108

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Smartphone {" +
                "screen='" + screen + '\'' +
                ", processor='" + processor + '\'' +
                ", battery=" + battery + " mAh" +
                ", camera=" + camera + " MP" +
                '}';
    }
}

