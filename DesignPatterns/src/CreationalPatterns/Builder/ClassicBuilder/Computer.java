package CreationalPatterns.Builder.ClassicBuilder;

public class Computer {

    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    protected Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilderImpl();
    }

    public abstract static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder HDD(String hdd) {
            this.HDD = hdd;
            return this;
        }

        public ComputerBuilder RAM(String ram) {
            this.RAM = ram;
            return this;
        }

        public ComputerBuilder isGraphicsCardEnabled(Boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder isBluetoothEnabled(Boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    private static final class ComputerBuilderImpl extends ComputerBuilder {
        public Computer build() {
            return new Computer(this);
        }
    }
}
