package Assignment1;

public class Main {
    public static void main(String[] args) {
        BuilderPhone customPhone = new BuilderPhone.Builder()
                .setBrand("Apple")
                .setModel("iPhone 16 Pro")
                .setScreen("OLED")
                .setProcessor("A18 Bionic")
                .setBattery(4700)
                .setCamera(48)
                .build();

        DefaultPhone defaultPhone = new DefaultPhone();

        System.out.println(customPhone);
        System.out.println(defaultPhone);
    }
}

