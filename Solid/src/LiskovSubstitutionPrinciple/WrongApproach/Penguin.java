package LiskovSubstitutionPrinciple.WrongApproach;

public class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguins can't fly!");
    }
}
