public class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Main method to demonstrate the overloaded add() methods
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Adding two integers
        int sumInt = calc.add(10, 20);
        System.out.println("Sum of 10 and 20 (integers): " + sumInt);
        
        // Adding two doubles
        double sumDouble = calc.add(10.5, 20.5);
        System.out.println("Sum of 10.5 and 20.5 (doubles): " + sumDouble);
        
        // Adding three integers
        int sumThreeInts = calc.add(10, 20, 30);
        System.out.println("Sum of 10, 20, and 30 (three integers): " + sumThreeInts);
    }
}

