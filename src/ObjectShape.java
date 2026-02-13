//this program is created to teach the concept of abstraction
abstract class Objects{
    //abstract method declaration
    abstract void showShape();
    public void shape(){
        System.out.println("I'm form abstract class");
    }
}

class Sphere extends Objects{
    /**
     * this is indirectly a overridden showshape method by making use of
     * abstract class
     */
    void showShape() {
        System.out.println("Object type is Sphere.");
    }
}

class Cuboid extends Objects{
    /**
     * this is indirectly a overridden showshape method by making use of
     * abstract class
     */
    void showShape() {
        System.out.println("Object type is Cuboid.");
    }
}

class Prism extends Objects{
    /**
     * this is indirectly a overridden showshape method by making use of
     * abstract class
     */
    void showShape() {
        System.out.println("Object type is Prism.");
    }
}
public class ObjectShape {
    public static void main(String args[]){
        Objects obj1;
        //object of Prism
        obj1 = new Prism();
        obj1.showShape();

        Objects obj2;
        //object of Cuboid
        obj2 = new Cuboid();
        obj2.showShape();

        Objects obj3;
        // Object of Sphere
        obj3 = new Sphere();
        obj3.showShape();


        obj1.shape();
        obj2.shape();
        obj3.shape();

    }
}
