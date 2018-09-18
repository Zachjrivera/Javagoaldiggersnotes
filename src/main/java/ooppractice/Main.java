package ooppractice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*
        Person Zach = new Person(182);
        //Zach.Boogie();
        System.out.println(Zach.Boogie());
        System.out.println(Zach.height);
        System.out.println(Zach.hungry());
        */



       /*
        Square a = new Square(5,6);
        System.out.println(a.Area());

        Circle c = new Circle(6);
        System.out.println(c.cirArea());


        Triangle t = new Triangle(20,12);
        System.out.println(t.triarea());

        Employee zach = new Employee("Zach", " Rivera","6/27/1996","9/18/2018");
        System.out.println(zach.toString());

        Employee darrien = new Employee("Darrien"," Williams","01/01/1865","09/18/2018");
        System.out.println(darrien.toString());

        Employee Bobby = new Employee("OG"," Bobby Johnson","10/11/1752","9/18/2018");
        */


/*
       Scanner Calcualtor = new Scanner(System.in);
        System.out.println("Enter number");
            double number1 = Calcualtor.nextDouble();

            System.out.println("Enter second number");
                double number2 = Calcualtor.nextDouble();

                Calculator calc = new Calculator(number1,number2);
                    System.out.println("The result of ");
                    System.out.println(calc.addition());
                    System.out.println(calc.subtraction());
                    System.out.println(calc.multiplication());
                    System.out.println(calc.division());
                    System.out.println(calc.square());
                    System.out.println(calc.squareRoot());
                    System.out.println(calc.exponent());
                    System.out.println(calc.calculateSin());
                    System.out.println(calc.calcutaleCosine());
*/



        Laptop dell = new Laptop("Dell",17,"Intel Pentium","6GB","1TB",3);
        System.out.println( dell.powerOn());
        System.out.println(dell.loadOS());
        System.out.println(dell.Batterylife());

        System.out.println(".....Next laptop.....");

        Laptop msi = new Laptop("MSI",17,"Intel I7","32GB","1TB",3);
        System.out.println( msi.powerOn());
        System.out.println(msi.loadOS());
        System.out.println(msi.Batterylife());
        System.out.println(msi.loadUserSettings());



    //===========================
    }

}
