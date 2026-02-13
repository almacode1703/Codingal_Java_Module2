class BasicShape {
    public double getArea(){
        return 0.0;
    }
}


// Triangle Area Calculation

class Triangle extends BasicShape {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return 0.5*this.height*this.base;
    }
}

class Square extends BasicShape {
   private double side;

   public Square(double side){
       this.side = side;
   }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}

public class PolyMorph {
    public static void main(String[] args) {
        BasicShape[] shapes = new BasicShape[2];
        shapes[0] = new Triangle(6.5, 9.2);
        shapes[1] = new Square(5);

        System.out.println("Area of Triange : "+shapes[0].getArea()+" sq cm");
        System.out.println("Area of Square : "+shapes[1].getArea()+" sq cm");
    }
}
