package DependencyInversionPrinciple.WrongApproach;

public class Vehicle {
    public Engine engine;
    public Vehicle() {
        this.engine = new Engine();
    }
    public void start() {
        engine.start();
    }
}
