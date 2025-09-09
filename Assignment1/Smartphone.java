package Assignment1;

public class Smartphone {
    private String screen; 
    private String processor; 
    private int battery; 
    private int camera; 

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


