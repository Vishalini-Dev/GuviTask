package guvi.task2;

public class PersonParent {
    protected String name;
    protected int age;
    PersonParent(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends PersonParent {
    String employeeId;
    double salary;
    public Employee(String name, int age, String employeeId,double salary) {
        super(name, age);
        this.employeeId=employeeId;
        this.salary=salary;
    }


    public static void main(String[] args) {
        Employee emp=new Employee("John",20,"101010",100000);
        System.out.println("Name:"+ emp.name);
        System.out.println("Age:"+emp.age);
        System.out.println("EmployeeId:"+emp.employeeId);
        System.out.println("Salary:"+emp.salary);
    }
}
