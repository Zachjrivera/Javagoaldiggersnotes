package ifstatments;


import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class IfElseStatments {
    public static void main(String[] args) {
/*
        String name  = "Zach";
        String age = "Twentey two";


        if (name.equals(age))
        {
            System.out.println("They are not equal");
        }   else if(name.equalsIgnoreCase("MIke Jones"))
                {
                    System.out.println("Mikeeee jones baby");
                }    else
                        {
                             System.out.println("Who");
                        }

        */

        /*
        String m = "Monday";
        String w = "Wednesday";
        String f = "Friday";
        String today = "Whatever";


        if (today.equals(m))
            {
                System.out.println("Its not " +m );
            }
            else if (today.equals(w))
                {
                 System.out.println("Its not " +w);
                }
                else if (!today.equals(f))
                    {
                    System.out.println("Today is "+ f );
                    }
                    else
                        {
                        System.out.println("today is not " + today);
                        }
        */


        /*
         //For Loops baby

         //  counter var; condition
        for(int x = 0;x<5; x ++)
        {
            System.out.println("five times ");
        }



        for (int n = 2; n<=10; n= n+2)
        {
            System.out.println(n *n);
        }

        for (int num = 1; num <=5 ; num++)
        {
            if (num == 3)
                {
                System.out.println("Hip");


                 } else if (num == 5)
                        {
                             System.out.println("Hop");
                        }   else
                            {

                                System.out.println(num);
                             }
        }

        for (int x = 1; x <= 20 ; x++)
        {
            if( (x%3 == 0) && (x % 5 == 0))
            {
                System.out.println("Hip hop");

            } else if (x % 5 == 0)
            {
                System.out.println("Hop");
            }else if (x % 3 == 0 )
            {
                System.out.println("Hip");
            }else
                {
                    System.out.println(x);
                }

        }
*/


/*
        //Switch cases

       // int x = 66;
        int day = (int)(Math.random()*7 + 1);
        String  dayOfTheWeek;

        switch (day)
        {
            case 1: dayOfTheWeek = "Monday";
                break;
            case 2: dayOfTheWeek = "Tuesday";
                break;
            case 3: dayOfTheWeek = "Wednesday";
                break;
            case 4: dayOfTheWeek = "Thursday";
                break;
            case 5: dayOfTheWeek = "Friday";
                break;
            case 6: dayOfTheWeek = "Saturday";
                break;
            case 7: dayOfTheWeek = "Sunday";
                break;
            default : dayOfTheWeek = "invalid day";
        }
        System.out.println(dayOfTheWeek);

        int num = (int)(Math.random()* 6 + 1);

        String roll;

        switch (num)
        {
            case 1: roll = "You rolled a 1";
                break;
            case 2: roll = "You rolled a 2";
                break;
            case 3: roll = "You rolled a 3";
                break;
            case 4: roll = "You rolled a 4";
                break;
            case 5: roll = "You rolled a 5";
                break;
            case 6: roll = "You rolled a 6";
                break;
                default: roll = "Fell off table try again";
        }

        System.out.println(roll
        );
*/

/*
    // Break

        for (int x = 6; x >=0; x--)
        {
            if(x == 2)
            {
             break;
            }
            System.out.println(x);
        }
*/

/*

//Arrays

                                //size of array originally 10 spaces
   int [] myFirstArray = new int [10];
        // adding to array
        myFirstArray [0] = 1;
        myFirstArray[9] = 10;
        System.out.println(myFirstArray[0]);


        int ninetyTwo = 92;
        myFirstArray[1]=ninetyTwo;

        System.out.println(myFirstArray[1]);

        System.out.println(Arrays.toString(myFirstArray));


        int sizeOfArray = myFirstArray.length;
        System.out.println(sizeOfArray);


        for (int x = 0; x < myFirstArray.length; x++)
        {
            System.out.println(myFirstArray[x]);
        }

        */



/*

        //Create a switch statement and randomly select the days of the week from this array (You Must use this array)

        String[] daysOfTheWeek = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
            int indexPo = (int)(Math.random()* 7); indexPo++;
            String day;

        switch (indexPo)
        {
            case 1: day = daysOfTheWeek[0];
                    break;
            case 2: day = daysOfTheWeek[1];
                    break;
            case 3: day = daysOfTheWeek[2];
                    break;
            case 4: day = daysOfTheWeek[3];
                    break;
            case 5: day = daysOfTheWeek[4];
                    break;
            case 6: day = daysOfTheWeek[5];
                    break;
            case 7: day = daysOfTheWeek[6];
                    break;
                    default: day = "Not a valid day";
        }
        System.out.println(day);
*/



/*
        //Create an array of your top 3 artist and use a for loop to print them to the console

        String [] favRapper = new String[3];
        // adding to array
        favRapper [0] = "Chance The Rapper";
        favRapper[1] = "Childish Gambino";
        favRapper [2] = "Biggie Smalls";

        for (int x = 0; x < favRapper.length; x++)
        {
            System.out.println(favRapper[x]);
        }
*/


/*

//        Create two different arrays with different numbers in each of the array.
//        Then multiply the second element of the first array by the third element of the second array and print the result.



        int [] array1 ={5,4,6,9,8};
        int [] array2 ={1,2,3,6,0};


        System.out.println(array1[1]*array2[2]);
*/


/*
//        Create a random number variable from 1 - 100
//        Then create an if else if statement to address and
//        print out the following outputs by using the random number generated



        int points =(int)(Math.random()* 100+1);

        if (points <= 59)
        {
            System.out.println("You got an F");
        }else if ((points >=60) && (points <= 69))
            {
                System.out.println("You got a D");
            }else if ((points >=70) && (points <= 79))
                {
                    System.out.println("You got a C");
                }else if ((points >=80) && (points <= 89))
                    {
                        System.out.println("You got a B");
                    }else
                        {
                            System.out.println("you got s A");
                        }
*/

/*
//        Use just a Scanner to ask a user for a name and age then print out to the console
//        the age of the the person next year

        Scanner birth = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = birth.nextLine();
        System.out.println("How old are you?");
        int age =birth.nextInt();
        System.out.println("Hey "+name+" Next year you will be "+(age+1)+" next year.");
*/



/*
//Use a Scanner and a while loop to ask for a username and a password.
// If the password is not equal to "TGIF" then keep asking the user for
//  the username and password. But once the user enters TGIF for the password
//  then print out "You logged in successfully". Also if the password is entered
//  incorrectly 3 times then print out "You are locked out. Contact the system admin"


        int tries = 0;
        String fuck = "";
        Scanner login = new Scanner(System.in);


        while (!fuck.equals("TGIF"))
        {
            tries++;
            System.out.println("Username");
            String signIn = login.nextLine();
            System.out.println("Password");
            String key = login.nextLine();

            if (tries == 3)
            {
                System.out.println("You are locked out. Contact system admin.");
                break;
            }else  if (key.equals("TGIF"))
                {
                    System.out.println("You logged in successfully.");
                    break;
                }
        }

*/



/*
//•Use a for loop to calculate the average of the numbers in this array

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        float avarage = 0;

        for (int index = 0; index < numbers.length; index++)
        {
           avarage += numbers[index] ;


        }
        System.out.println(avarage/numbers.length);

*/

/*
       // Use a for loop to calculate the sum of the numbers in this array.
        int[] lottoNumbers = {11,21,23,14,5,65};
        int sum = 0;

        for(int i = 0; i < lottoNumbers.length;i++)
        {
            sum += lottoNumbers[i];
        }
        System.out.println(sum);
*/


/*


  //  Using a loop, find and replace every nth word in a string with
    //“Wu” where n is divisible by 2, and every nth word where n is divisible by 3 with “Tang”



        String [] sentance = {" ","The","small","brown","dog","hopped","the","fence"};
        for (int n = 1; n <sentance.length ; n++)
        {
            if (n % 2 == 0){
                System.out.println("Wu");

            } else if (n % 3 == 0) {
                System.out.println("Tang");
            }else
                {
                    System.out.println(sentance[n]);
                }
        }

*/


//Book reading








        //----------------------------------------
    }

}


