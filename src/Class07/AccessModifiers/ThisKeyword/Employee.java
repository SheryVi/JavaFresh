package Class07.AccessModifiers.ThisKeyword;

public class Employee {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    Employee(){}


    Employee(String name, String lastName, int employeeId, String startDate, int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }

    void printMethod(){
        System.out.println(name+" "+ lastName+" "+employeeId+" "+startDate+" "+salary);
    }
}
