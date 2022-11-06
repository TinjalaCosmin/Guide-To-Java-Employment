package DependencyInversionPrinciple.CorrectApproach;

public class Vehicle {
    public Engine engine;
    //Now we can use any type of engine we want, in case we add more in the future
    public Vehicle(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        engine.start();
    }
}
