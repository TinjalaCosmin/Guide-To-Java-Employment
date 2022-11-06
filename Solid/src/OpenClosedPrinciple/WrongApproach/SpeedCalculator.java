package OpenClosedPrinciple.WrongApproach;

public class SpeedCalculator {

    public void calculateSpeed(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            // Calculate Speed here…
        } else if (vehicle instanceof Airplane) {
            //Calculate Speed here…
        } else if (vehicle instanceof Bicycle) {
            //Calculate Speed here…
        }
    }
}
