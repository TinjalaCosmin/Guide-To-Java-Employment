package InterfaceSegregationPrinciple.WrongApproach;

public class Square implements Shape {
    @Override
    public void calculateArea() {

    }

    @Override
    public void calculateVolume() {
        //Not needed for a square
    }
}
