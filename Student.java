// Define the Student class
public class Student {
    // Attributes for name and age (with 'final' for both fields)
    private final String name;
    private final int age;

    // Default constructor that assigns default values
    public Student() {
        this.name = "Unknown";  // 'final' field must be initialized in the constructor
        this.age = 18;          // 'final' field must be initialized in the constructor
    }

    // Parameterized constructor to initialize attributes with user-defined values
    public Student(String name, int age) {
        this.name = name;  // 'final' field must be initialized in the constructor
        this.age = age;    // 'final' field must be initialized in the constructor
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Create an object using the default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Details (using default constructor):");
        student1.displayDetails();
        System.out.println();

        // Create an object using the parameterized constructor
        Student student2 = new Student("John", 20);
        System.out.println("Student 2 Details (using parameterized constructor):");
        student2.displayDetails();
    }
}
