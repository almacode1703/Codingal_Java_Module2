import java.util.Scanner;

// Parent
class Addition {
    void add(double a, double b) {
        System.out.println("Result = " + (a + b));
    }
}

// Child 1
class Subtraction extends Addition {
    void subtract(double a, double b) {
        System.out.println("Result = " + (a - b));
    }
}

// Child 2
class Multiplication extends Subtraction {
    void multiply(double a, double b) {
        System.out.println("Result = " + (a * b));
    }
}

// Child 3 (Lowest)
class Division extends Multiplication {
    void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return;
        }
        System.out.println("Result = " + (a / b));
    }
}

// Main class
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Object of lowest child
        Division obj = new Division();

        System.out.println("--- CALCULATOR ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (choice) {
            case 1:
                obj.add(a, b);
                break;

            case 2:
                obj.subtract(a, b);
                break;

            case 3:
                obj.multiply(a, b);
                break;

            case 4:
                obj.divide(a, b);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
