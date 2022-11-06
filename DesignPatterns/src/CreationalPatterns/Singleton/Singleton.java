package CreationalPatterns.Singleton;

public class Singleton {

    private static Singleton singleInstance = null;

    public String message;

    private Singleton() {
        message = "This is the default message";
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}
