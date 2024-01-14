package vehicle;

public class Vehicle {

    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle() {
    }

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.passengers = passengers;
        this.fuelUsage = passengers == 0 ? fuelUsage : (float) (fuelUsage + fuelUsage * (0.05 * passengers));
    }

    public float getFuel() {
        return fuel;
    }

    public float getFuelUsage() {
        return fuelUsage;
    }

    public float maxDistance() {
        return (fuel / fuelUsage) * 100;
    }

    public float maxDistance(float fuel, float fuelUsage, int passengers) {
        return fuel / (fuelUsage + fuelUsage * (float)(0.05 * passengers));
    }
}
