package CreationalPatterns.Builder.BuilderWithGenerics;

public class Computer {

    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    protected Computer(ComputerBuilder<?, ?> computerBuilder) {
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

    public static ComputerBuilder<?, ?> builder() {
        return new ComputerBuilderImpl();
    }

    public abstract static class ComputerBuilder<C extends Computer, B extends ComputerBuilder<C, B>> {
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public B HDD(String hdd) {
            this.HDD = hdd;
            return self();
        }

        public B RAM(String ram) {
            this.RAM = ram;
            return self();
        }

        public B isGraphicsCardEnabled(Boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return self();
        }

        public B isBluetoothEnabled(Boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return self();
        }

        public abstract C build();

        protected abstract B self();
    }

    private static final class ComputerBuilderImpl extends ComputerBuilder<Computer, ComputerBuilderImpl> {
        public Computer build() {
            return new Computer(this);
        }

        protected ComputerBuilderImpl self() {
            return this;
        }
    }
}
