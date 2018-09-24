package employee;

public class Employee {
    private String firstName;
    private String lastName;
    private final String socislSecurityNumber = "222-222-2222";
    private int salary;
    private String title;
    private int bonus;


    public Employee(String firstName,String lastName,int salary,String title,String socislSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.title = title;

    }


    public String getFirstName() {
        return firstName;
    }

        public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

            public String getLastName() {
        return lastName;
    }

                public void setLastName(String lastName) {
                    this.lastName = lastName;
                }

                    public String getSocislSecurityNumber() {
        return socislSecurityNumber;
    }

                        public double getSalary() {
        return salary;
    }

                            public void setSalary(int salary) {
        this.salary = salary;
    }

                                public String getTitle() {
        return title;
    }

                                    public double getBonus() {
        return bonus;
    }

                                        public void setBonus(int bonus) {
        this.bonus = bonus;
    }

                                                    public void setTitle(String title) {
        this.title = title;



    }


    public int payCheck(){
        return salary + bonus;
    }

    public String printEmployeeProfile()
    {
        return "Employee's Full name: " + firstName + " " + lastName
                + "\n Employee's salary is: $" + salary
                +"\n Employee's title is: " + title
                +"\n Employee's salary after bonus  is: $" + payCheck();
    }





   //======================================================
}
