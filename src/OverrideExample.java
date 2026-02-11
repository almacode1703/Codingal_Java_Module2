class Car {
    String color;
    double price;
    int weight;

    Car(String color, double price, int weight){
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public void Display(){
        System.out.println("My Car is : "+this.color+" with a price tag of  "+this.price+" and weights "+this.weight + "pounds");
    }
}

class Mercedes extends Car {
    String color;
    double price;
    int weight;
    String maker;

    Mercedes(String color, double price, int weight, String maker){
        super(color, price, weight);
        this.maker = maker;
    }

    @Override
    public void Display() {
        System.out.println("Mercedes is awesome");
        super.Display();
        System.out.println("Also Maker : "+this.maker);
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Mercedes benz = new Mercedes("Blue", 55556.545,120,"German Company");
    }
}
