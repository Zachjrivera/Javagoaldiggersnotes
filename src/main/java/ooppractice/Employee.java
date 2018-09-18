package ooppractice;

public class Employee {
    public String firstName;
    public String lastName;
    public String birthDate;
    public String hireDate;


    public Employee(String firstName,String lastName,String birthDate,String hireDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString (){
        return "Employee name : " + this.firstName + this.lastName +"\n" + "Employee DOB : " + this.birthDate + "\n" +"Employee Hire date : " + this.hireDate;
    }
}
