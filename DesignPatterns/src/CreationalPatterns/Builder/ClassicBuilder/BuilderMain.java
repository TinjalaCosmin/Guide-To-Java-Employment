package CreationalPatterns.Builder.ClassicBuilder;

public class BuilderMain {

    public static void main(String[] args) {
        Computer computer1 = Computer.builder()
                .HDD("VERY GOOD")
                .RAM("8 GB")
                .isBluetoothEnabled(true)
                .isGraphicsCardEnabled(true)
                .build();

        System.out.println(computer1);
    }
}
