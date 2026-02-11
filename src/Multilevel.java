class GrandFather{
    double networth;
    int age;

    GrandFather(double networth, int age){
        this.networth = networth;
        this.age = age;
    }

    public void DisplayGF(){
        System.out.println("This is about Grandfather...");
        System.out.println("Age : "+this.age+" with a total networth of : "+this.networth);
    }
}

class Father extends GrandFather {
    String occupation;
    int fathersAge;
    Father(double networth, int age,  String occupation) {
        super(networth, age);
        this.occupation = occupation;
    }

    public void DisplayF(){
        fathersAge = this.age - 25;
        System.out.println("This is about Father.. ");
        System.out.println("Age : "+ fathersAge +" with a total networth of : "+this.networth*2+" and occupation : "+this.occupation);
    }
}

class Son extends Father {
    String hobby;
    Son(double networth, int age, String occupation, String hobby){
       super(networth, age, occupation);
       this.hobby = hobby;
    }

    public void DisplaySon() {
        int sonAge = super.fathersAge - 25;
        System.out.println("This is about son..");
        System.out.println("Age : "+sonAge+" with a total networth of : "+this.networth*4+"and occupation : "+this.occupation +" and Occupation: "+this.occupation);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Son s1 = new Son(455468.56, 75, "Student", "Acting");
        s1.DisplayGF();
        s1.DisplayF();
        s1.DisplaySon();
    }
}
