package OpenClosedPrinciple.CorrectApproach;

public class CorrectApproach {

    public void carSpeed() {
        Vehicle car = new Car();
        car.calculateSpeed();
        Vehicle airplane = new Airplane();
        airplane.calculateSpeed();
    }
}
