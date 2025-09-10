package Assignment1;
public class DefaultPhone {
    private String brand;
    private String model;
    private String screen;
    private String processor;
    private int battery;
    private int camera;

    public DefaultPhone() {
        this.brand = "Samsung";
        this.model = "Galaxy A15";
        this.screen = "IPS";
        this.processor = "MediaTek Helio G99";
        this.battery = 5000;
        this.camera = 50;
    }

    @Override
    public String toString() {
        return "DefaultPhone {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screen='" + screen + '\'' +
                ", processor='" + processor + '\'' +
                ", battery=" + battery + " mAh" +
                ", camera=" + camera + " MP" +
                '}';
    }
}
