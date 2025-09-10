package Assignment1;
public class BuilderPhone {
    private String brand;
    private String model;
    private String screen;
    private String processor;
    private int battery;
    private int camera;

    private BuilderPhone(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.screen = builder.screen;
        this.processor = builder.processor;
        this.battery = builder.battery;
        this.camera = builder.camera;
    }

    @Override
    public String toString() {
        return "BuilderPhone {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screen='" + screen + '\'' +
                ", processor='" + processor + '\'' +
                ", battery=" + battery + " mAh" +
                ", camera=" + camera + " MP" +
                '}';
    }

    public static class Builder {
        private String brand;
        private String model;
        private String screen;
        private String processor;
        private int battery;
        private int camera;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public Builder setCamera(int camera) {
            this.camera = camera;
            return this;
        }

        public BuilderPhone build() {
            return new BuilderPhone(this);
        }
    }
}




