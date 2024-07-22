public class Bicycle extends TransportWheeled {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку, велосипед");
    }

    @Override
    public void servis() {
        updateTyre();
    }
}
