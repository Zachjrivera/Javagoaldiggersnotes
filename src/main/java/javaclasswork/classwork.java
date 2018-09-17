package javaclasswork;

import java.math.BigInteger;
import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
//        System.out.println("this should print");
//        System.out.println("THis is a update");
//        System.out.println("Hey Zach you dumb");
//------------Problem 1
      /*
        int pro1 = 1;
        System.out.println("*** OutPut ***");
        while(pro1 != 19)
        {
            pro1 = pro1 +2;

            System.out.println(pro1);
        }
//-----------Problem 2
        int b =1;
        int d =1;
        System.out.println("*** OutPut ***");

        while (b <= 10)
        {

         b =b+1;

            System.out.println(b*b);
        }
//----------problem 3
        Scanner pro3 = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = pro3.nextInt();

        while(number != 20)
        {
            number++;
            System.out.println(number);


        }
*/
//------------Problem 4
       /*
        Scanner pro4 = new Scanner(System.in);
        System.out.println("Enter starting number");
        int number1 = pro4.nextInt();
        System.out.println("Enter ending number");
        int number2 = pro4.nextInt();


        while (number1 != number2)
       {

               System.out.printf("%d,",number1);

          number1++;
           //System.out.printf("%d"number1);
       }
        System.out.println(number2);
        */

/*
        The Fibonacci sequence is a series of numbers where a number is found by adding up the two numbers before it. Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so forth.

        Using a loop, create a string containing a comma-delimited Fibonacci sequence up to a maximum value.

                Example:
        Below will be the input passed as a parameter when the method is called/invoked
                Input = 18

        Below will be the output if your code works as expected
                Output = 0, 1, 1, 2, 3, 5, 8, 13

        so you take the some of two numbers and add it to the next number and end at the number specified.


    int num1 = 0;
    int num2 = 1;
    int num3 = 1;

    Scanner fib = new Scanner(System.in);
        System.out.println("Pick a number.");
        int number = fib.nextInt();


        System.out.printf("%d,",num1);
        System.out.printf("%d,",num2);

        do
        {
            num3 =num2+num1;
            System.out.printf("%d," ,num3);
            num1 = num2;
            num2 = num3;
        }   while(num2<=number);
                {

                 }

        System.out.println(number);



*/


// 9/17/2018 notes

        /*Continute
        for(int x = 0; x <= 10; x++)
        {
            if(x == 5)
            {}
        }
        */

       /*
        //if using Big numbers cant use = - % /

        BigInteger a= BigInteger.valueOf(1000456000);
        BigInteger b = new BigInteger("36546554422");
        BigInteger c = a.add(b);
        System.out.println(c);
        */

       //for each loop


        String[] top3 = {"Ace","Wale","Meek"};
        for (String x:top3) {
            System.out.println(x);
        }

        //anonymous arrays

        //later date

        //copyof is a method sort is method acending order

        //multidimensional arrays
/*
        int [][] magicSquare =
                {
                    //  column
                        {16,3,2,13}, //row
                        {5,10,11,8},
                        {9,6,7,12},
                        {4,15,14,1}

                };
        System.out.println(magicSquare[0][1]);



        for (int magicrow = 0; magicrow < magicSquare.length; magicrow++)
        {
            for (int magiccoll = 0; magiccoll < magicSquare[magicrow].length; magiccoll++)
            {
            System.out.print(magicSquare[magicrow][magiccoll] + "\t");
            }
                System.out.println(); }
*/




//        String [][] honorifics =
//                {
//                        {"Mr.","Mrs.","Mc."},
//                        {" Tee"," Hammer"," Jones"},
//                };
//        System.out.println(honorifics[0][0] + honorifics[1][0]);
//        System.out.println(honorifics[0][1]+ honorifics[1][2]);
//        System.out.println(honorifics[0][2]+ honorifics[1][1]);


        //loop through multi dimensional arrays
        // value at arr[0][0]is 16

 //










        //---------------------------------------------------------------------------
    }
}
