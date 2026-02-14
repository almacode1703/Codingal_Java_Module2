// Demonstration of Method Overloading and Method Overriding

// Parent class
class ParentClass {

    // This method will be overridden in child
    void show() {
        System.out.println("Show method from Parent");
    }

    // ---------------- METHOD OVERLOADING ----------------
    // Same method name, different parameters

    int add(int a, int b) {
        System.out.println("Addition of integers:");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("Addition of doubles:");
        return a + b;
    }
}

// Child class
class Child extends ParentClass {

    // ---------------- METHOD OVERRIDING ----------------
    // Same method signature, but different implementation
    @Override
    void show() {
        System.out.println("Show method from Child");
    }
}

// Main class
public class OverrideClass {
    public static void main(String[] args) {

        // Object of child
        Child obj = new Child();

        // ----------- OVERRIDING -----------
        // Child version will run
        obj.show();

        // ----------- OVERLOADING -----------
        System.out.println(obj.add(10, 20));      // int version
        System.out.println(obj.add(5.5, 2.5));    // double version
    }
}
