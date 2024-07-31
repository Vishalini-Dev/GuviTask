//Question2

public class Employee implements Taxable {
    private int empId;
    private String name;
    private int salary;

    public Employee(int empId,String name,int salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }


    @Override
    public double calcTax() {
        return  (double) Math.round(salary * incomeTax * 100) /100;
    }
}
