import java.util.*;

public class test {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	
	System.out.print("Enter Princial Amount: ");
	double principal = scan.nextDouble();
	System.out.print("Enter Loan Term (Months): ");
	double term = scan.nextDouble();
	System.out.print("Enter Active Years: ");
	double years = scan.nextDouble();
	
	double monthlyWithInterest;
	
	if (years >= 5) {
		monthlyWithInterest = (principal / term) * 1.01;
	} else if (years >= 2){
		monthlyWithInterest = (principal / term) * 1.02;
	} else {
		monthlyWithInterest = (principal / term) * 1.035;
 	}
	
	//total loan amount + processing and service fee
	double totalLoanAmount = (monthlyWithInterest * term) + (principal * .04);
	
	System.out.println("Your Total Loan Amount: " + totalLoanAmount);
	System.out.println("Your Monthly Payment: " + monthlyWithInterest);
}
}