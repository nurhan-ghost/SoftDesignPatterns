package Assignment1;
public interface Builder {
    void reset();
    void setScreen(String type);
    void setProcessor(String processor);
    void setBattery(int capacity);
    void setCamera(int megapixels);
}


