package employee;

public class HourlyEmployee {

    private String firstName;
    private String lastName;
    private float wage;
    private int hours;
    public String title;



    public HourlyEmployee(String firstName,String lastName, String title,float wage,int hours)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.wage = wage;
        this.hours = hours;
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

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }



    public float paycheck()
    {
        return wage * hours;
    }


    public String printEmployeeProfile()
    {
        return "Employee's Full name: " + firstName + " " + lastName
                +"\n Employee's title is: " + title
                + "\n Employee's salary is: $" + paycheck();
    }


}


