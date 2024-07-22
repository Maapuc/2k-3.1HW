public class Truck extends TransportWheeled {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп, грузовик");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку, грузовик");
    }


    public void chekEngin() {
        System.out.println("Проверяем двигатель, грузовик");
    }

    @Override
    public void servis() {
        updateTyre();
        chekEngin();
        checkTrailer();
    }
}
