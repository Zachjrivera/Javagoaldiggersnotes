package javaclasswork;

public class homework {
    public static void main(String[] args) {

    // This will print all numbers in array ask Teacher about \t don't understand

        int [][] magicSquare =
                {
                        //  column
                        {16,3,2,13}, //row
                        {5,10,11,8},
                        {9,6,7,12},
                        {4,15,14,1}

                };
       // System.out.println(magicSquare[0][1]);


        // for loop for row and for loop for collum system out both under the same array name
        for (int magicrow = 0; magicrow < magicSquare.length; magicrow++)
        {
            for (int magiccoll = 0; magiccoll < magicSquare[magicrow].length; magiccoll++)
            {
               System.out.print(magicSquare[magicrow][magiccoll] + "\t"); //variables increase index pos one each loop
              //  System.out.println("Values at array " + "["+ magicrow +"]" +"[" +magiccoll +"]" + " is " +magicSquare[magicrow][magiccoll]  );// how can i put brakets in easier maybe %d[]
            }
             }








        //-------------------------------------------------------------------------
    }
}
