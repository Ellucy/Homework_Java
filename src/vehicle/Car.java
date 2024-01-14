package vehicle;

public class Car extends Vehicle {

    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    @Override
    public float maxDistance() {

        if (airConditioner) {
            return (getFuel() / (getFuelUsage() + getFuelUsage() * 0.1f)) * 100;
        } else {
            return (getFuel() / getFuelUsage()) * 100;
        }
    }
}
