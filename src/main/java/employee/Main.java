package employee;

public class Main {
    public static void main(String[] args) {


        HourlyEmployee employee1 = new HourlyEmployee("Jane","Jones","HelpDesk Technician",1000,8);

                System.out.println(employee1.printEmployeeProfile());
                System.out.println(employee1.paycheck());

        Employee newEmplyoee = new Employee("Mike","Jones",100000,"Software Developer","222-222-2222");

                newEmplyoee.setBonus(200);

                System.out.println(newEmplyoee.printEmployeeProfile());


        //=================================================================
    }
}
