package EndTerm_LaboratoryActivities;
import java.util.*;
public class passenger {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("[1] - Taxi");
		System.out.println("[2] - Jeepney");
		System.out.print("Enter Vehicle Type: ");
		int vehicleType = scan.nextInt();
		System.out.print("Enter Distance Travelled: ");
		double distance =  scan.nextDouble();
		System.out.print("Total Number of Passengers: ");
		int numOfPassengers = scan.nextInt();
		
		if (vehicleType == 1) {
			taxi(numOfPassengers, distance);
		} else if (vehicleType == 2) {
			jeep(numOfPassengers, distance, distance);
		}
	}
	
	static void taxi(int numOfPassengers, double distance) {
		double farePerKm = distance * 20;
		double fare = farePerKm + 60;
		double totalFare = (fare * numOfPassengers);			
		System.out.printf("Total Fare: PHP %,.2f%n", totalFare);
	}
	
	static void jeep(int numOfPassengers, double distance, double totalFare) {
		System.out.print("Enter Number of Regular Passengers: ");
		int regularPassengers = scan.nextInt();
		System.out.print("Enter Number of Senior Citizen/Student/PWD Passengers: ");
		int specialPassengers = scan.nextInt();
		if (distance > 4) {
			double regularFarePerKm = (distance - 4) * 1.15;
			double specialFarePerKm = (distance - 4) * 0.92;
			double regularTotalFare = (regularFarePerKm + 11) * regularPassengers;
			double specialTotalFare = (specialFarePerKm + 10) * specialPassengers;
			totalFare = regularTotalFare + specialTotalFare;
		} else if (distance > 0 && distance <= 4) {
			double regularTotalFare = 11 * regularPassengers;
			double specialTotalFare = 10 * specialPassengers;
			totalFare = regularTotalFare + specialTotalFare;
		}
		System.out.printf("Total Fare: PHP %,.2f%n", totalFare);
	}
}
