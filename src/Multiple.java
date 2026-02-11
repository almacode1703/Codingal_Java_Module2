class A {
    void DisplayA(){
        System.out.println("This is inside class A");
    }
}

class B extends A {
    void DisplayB() {
        System.out.println("This is inside class B");
    }
}

class C extends A {
    void DisplayC() {
        System.out.println("This is inside class C");
    }
}

public class Multiple {
    public static void main(String[] args) {
        C c1 = new C();
        c1.DisplayA();
        c1.DisplayC();
    }
}
