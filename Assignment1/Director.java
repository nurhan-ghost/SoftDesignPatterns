package Assignment1;

public class Director {
    public void buildBudgetPhone(Builder builder) {
        builder.reset();
        builder.setScreen("IPS");
        builder.setProcessor("Snapdragon 680");
        builder.setBattery(4000);
        builder.setCamera(12);
    }

    public void buildFlagshipPhone(Builder builder) {
        builder.reset();
        builder.setScreen("OLED");
        builder.setProcessor("Snapdragon 8 Gen 2");
        builder.setBattery(5000);
        builder.setCamera(108);
    }
}
