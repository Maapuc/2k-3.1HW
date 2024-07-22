public abstract class TransportMotor extends TransportWheeled {

    public TransportMotor(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public abstract void chekEngin();

    public abstract void updateTyre();
}

