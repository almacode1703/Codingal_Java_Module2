class Person {
    int age;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void Display(){
        System.out.println(this.name+" is of age : "+this.age);
    }
}

class Student extends  Person{
   int phonenumber;

   Student(int age, String name, int phonenumber){
       super(age, name);
       this.phonenumber = phonenumber;
   }

   public void Display(){
       System.out.println(this.name +" is of age : "+ this.age+ " is having phonenumber : "+this.phonenumber);
   }
}


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(28,"John", 344596);
        s1.Display();
    }
}
