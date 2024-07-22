public class Car extends TransportMotor {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void chekEngin() {
        System.out.println("Проверяем двигатель, автомобиль");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку, автомобиль");
    }

    @Override
    public void servis() {
    updateTyre();
    chekEngin();
    }
}