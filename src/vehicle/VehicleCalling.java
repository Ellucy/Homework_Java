package vehicle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VehicleCalling {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fuel amount in your vehicle: ");
        float fuel = scanner.nextFloat();
        System.out.print("Enter your vehicle's fuel usage per 100 km: ");
        float fuelUsage = scanner.nextFloat();
        System.out.print("Enter how many passengers will be in the vehicle: ");
        int passengers = scanner.nextInt();

        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);
        System.out.println("Your vehicle can drive maximum of " + decimalFormat.format(vehicle.maxDistance()) + " kilometers ");
        scanner.close();
    }
}
