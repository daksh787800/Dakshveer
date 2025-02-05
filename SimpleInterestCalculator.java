import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter Rate of interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Time period in years: ");
        double time = sc.nextDouble();

        // Simple Interest formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("The Simple Interest is: " + simpleInterest);
    }
}
