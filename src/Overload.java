class Parent {
    String name;
    Parent(String name){
        this.name = name;
    }
    public String Display(){
        return "Name : "+this.name;
    }
}

class Child1 extends Parent{
    int age;
    Child1( String name, int age){
        super(name);
        this.age = age;
    }

    @Override
    public String Display() {
        return super.Display()+ " Age : "+this.age;
    }
    public String Fun(){
        return "Overload works in JAVA";
    }
}

class Child2 extends Parent{
    int age;
    boolean isAdult;
    Child2( String name, int age, boolean isAdult){
        super(name);
        this.age = age;
        this.isAdult = isAdult;
    }

    @Override
    public String Display() {
        return "Name : "+this.name+ " Age : "+this.age+ " Is an Adult : "+this.isAdult;
    }

    public String Fun(){
        return "Overload works in JAVA";
    }
}

public class Overload {
    public static void main(String[] args) {
        Parent p1 = new Child1("Jyotirmoy", 28);
        Parent p2 = new Child2("Jyotirmoy", 28, false);
        System.out.println(p1.Display());
        System.out.println(p2.Display());
    }
}
