import java.util.*;

class EmployeeBean{
    private int id;
    private String name;
    private double salary;
    private double netSalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void calculateNetSalary( int pfPercentage){
        double pfAmount = (salary * pfPercentage)/100;
        netSalary = salary - pfAmount;
    }
}

class EmployeeSalaryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeBean emp = new EmployeeBean();

        System.out.print("Enter Employee ID : ");
        emp.setId(scanner.nextInt());

        System.out.print("Enter Employee name : ");
        emp.setName(scanner.next());

        System.out.print("Enter Employee salary : ");
        emp.setSalary(scanner.nextDouble());

        System.out.print("Enter pf value : ");
        int pf = scanner.nextInt();

        emp.calculateNetSalary(pf);

        System.out.println("Employee ID : "+emp.getId());
        System.out.println("Employee Name : "+emp.getName());
        System.out.println("Employee Salary : "+emp.getSalary()+"$");
        System.out.println("Employee Net Salary : "+emp.getNetSalary()+"$");

        scanner.close();
    }
}