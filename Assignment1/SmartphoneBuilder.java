package Assignment1;

public class SmartphoneBuilder implements Builder {
    private Smartphone phone;

    public SmartphoneBuilder() {
        reset();
    }

    @Override
    public void reset() {
        phone = new Smartphone();
    }

    @Override
    public void setScreen(String type) {
        phone.setScreen(type);
    }

    @Override
    public void setProcessor(String processor) {
        phone.setProcessor(processor);
    }

    @Override
    public void setBattery(int capacity) {
        phone.setBattery(capacity);
    }

    @Override
    public void setCamera(int megapixels) {
        phone.setCamera(megapixels);
    }

    public Smartphone getResult() {
        return phone;
    }
}
