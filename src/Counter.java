public class Counter {

    int number = 10;
    public void increment(){
        number++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.increment();
        c2.increment();
        c3.increment();

        System.out.println(c1.number);
        System.out.println(c2.number);
        System.out.println(c3.number);

    }


}
