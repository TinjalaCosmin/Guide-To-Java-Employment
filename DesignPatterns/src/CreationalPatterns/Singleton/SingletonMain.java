package CreationalPatterns.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();
        Singleton thirdInstance = Singleton.getInstance();

        System.out.println(firstInstance.hashCode());
        System.out.println(secondInstance.hashCode());
        System.out.println(thirdInstance.hashCode());

        if (firstInstance == secondInstance && secondInstance == thirdInstance) {
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }

        firstInstance.message = (firstInstance.message).toUpperCase();

        System.out.println("First instance: " + firstInstance.message);
        System.out.println("Second instance: " + secondInstance.message);
        System.out.println("Third instance: " + thirdInstance.message);

        thirdInstance.message = (thirdInstance.message).toLowerCase();

        System.out.println("First instance: " + firstInstance.message);
        System.out.println("Second instance: " + secondInstance.message);
        System.out.println("Third instance: " + thirdInstance.message);
    }
}
