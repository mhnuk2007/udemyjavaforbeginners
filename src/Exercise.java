// TODO: Create an class called Employee
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getDetails(){
        return "Name: " + this.name + ", " + "Salary: " + this.salary;
    }
}


// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getDetails(){
        return super.getDetails() + ", " + "Department: " + this.department;
    }

}



public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee employee = new Employee("Alice", 50000);
        Manager manager = new Manager("Bob", 80000, "IT");
        // TODO: Print their details using getDetails()

        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());
    }
}
