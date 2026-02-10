public class StudentDetails {
     String sname;
     String sgender;
     int sphone;

     StudentDetails(String sname, String sgender, int sphone){
         this.sname = sname;
         this.sgender = sgender;
         this.sphone = sphone;
     }

    public static void main(String[] args) {

        StudentDetails s1 = new StudentDetails("JOHN", "MALE", 517999220);
        StudentDetails s2 = new StudentDetails("David", "MALE", 517996720);
        StudentDetails s3 = new StudentDetails("Mohan", "MALE", 517944420);
        StudentDetails s4 = new StudentDetails("Jennifer", "FEMALE", 523999220);
        StudentDetails s5 = new StudentDetails("Satyam", "MALE", 517995520);
        StudentDetails s6 = new StudentDetails("Raju", "MALE", 317999340);

        System.out.println("STUDENT RECORDS.....");
        System.out.println(s1.sname+" "+ s1.sgender+" "+s1.sphone);
        System.out.println(s2.sname+" "+ s2.sgender+" "+s2.sphone);
        System.out.println(s3.sname+" "+ s3.sgender+" "+s3.sphone);
        System.out.println(s4.sname+" "+ s4.sgender+" "+s4.sphone);
        System.out.println(s5.sname+" "+ s5.sgender+" "+s5.sphone);
        System.out.println(s6.sname+" "+ s6.sgender+" "+s6.sphone);



    }
}
