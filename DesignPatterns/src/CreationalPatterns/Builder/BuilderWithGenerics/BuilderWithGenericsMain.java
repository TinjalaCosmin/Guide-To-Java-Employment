package CreationalPatterns.Builder.BuilderWithGenerics;

public class BuilderWithGenericsMain {

    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .HDD("YES")
                .isBluetoothEnabled(true)
                .build();
        System.out.println(computer);

        Computer computer2 = Computer.builder()
                .HDD("YES")
                .RAM("ALL")
                .isBluetoothEnabled(true)
                .isGraphicsCardEnabled(true)
                .build();
        System.out.println(computer2);
    }
}
