interface SampleInterface {
    public void display();
    public int addNums( int a, int b);
}


public class TestInterface implements SampleInterface {

    @Override
    public void display() {
        System.out.println("This is the display method");
    }

    @Override
    public int addNums(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        SampleInterface s1 = new TestInterface();
        s1.display();
        System.out.println("Result of Addition : "+s1.addNums(5,6));
    }
}
