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
        System.out.print("Will you turn on air conditioner? (y/n): ");
        char res = scanner.next().charAt(0);

        boolean conditioner = res == 'y' ? true : false;

        Car car = new Car(fuel, fuelUsage, passengers, conditioner);
        System.out.println("Your car can drive maximum of " + decimalFormat.format(car.maxDistance()) + " kilometers ");
        scanner.close();
    }
}
