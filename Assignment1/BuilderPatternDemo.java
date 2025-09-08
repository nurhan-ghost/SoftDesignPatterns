package Assignment1;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Director director = new Director();
        SmartphoneBuilder builder = new SmartphoneBuilder();

        director.buildBudgetPhone(builder);
        Smartphone budgetPhone = builder.getResult();
        System.out.println("Budget Phone: " + budgetPhone);

        director.buildFlagshipPhone(builder);
        Smartphone flagshipPhone = builder.getResult();
        System.out.println("Flagship Phone: " + flagshipPhone);
    }
}
