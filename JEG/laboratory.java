package EndTerm_LaboratoryActivities;
import java.util.*;
public class laboratory {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		double fare = 0, distance = 0;
		int numOfPassengers = 0, passengerType = 0;
		
		System.out.println("[1] - Taxi"); 
		System.out.println("[2] - Jeepney");
		System.out.println("[3] - Train");
		System.out.print("Enter Vehicle Type: ");
		int vehicleType = scan.nextInt();
		System.out.print("Enter Fare: ");
		fare =  scan.nextDouble();
		
		if (vehicleType == 1) {
			distance = (fare - 60) / 20;		
			System.out.println("\nTotal Distance that can be travelled: " + distance + " kilometers");
		} else if (vehicleType == 2) {
			System.out.println("\n[1] - Regular");
			System.out.println("[2] - Senior Citizen/Student/PWD");
			System.out.print("Enter Type of Passenger: ");
			passengerType = scan.nextInt();
			if (passengerType == 1) {
				distance = (fare - 11) / 1.15;
			} else if (passengerType == 2) {
				distance = (fare - 10) / 0.92;
			}
			System.out.println("\nTotal Distance that can be travelled: " + distance + " kilometers");
		} else if (vehicleType == 3) {
			double farePerPassenger = 150;
			distance = (fare / farePerPassenger) * 217;
			numOfPassengers = (int) (fare / 150);
			if (numOfPassengers == 0) {
				numOfPassengers = 1;
			}
			System.out.println("\nTotal Distance that can be travelled: " + distance + " kilometers");
			System.out.println("Number of Passengers that can be included in the fare: " + numOfPassengers);
		}
	}
}
