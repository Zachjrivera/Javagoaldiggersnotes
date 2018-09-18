package ooppractice;

public class Calculator {
    double number1;
    double number2;

    public Calculator (  double number1, double number2)
    {
        this.number1= number1;
        this.number2=number2;
    }

        public String  addition()
        {
         return "number1 + number2 is : " + (number1+number2);

        }

            public String subtraction()
            {
                return "number1 - number2 is : " + (number1 - number2);
            }

                public String division()
                {
                    return "number1 divided by  number2 is : " + (number1/number2);
                }

                    public String multiplication()
                    {
                        return"number1 * number2 is : " + (number1*number2);
                    }

                         public String square()
                         {
                             return " the square of number1 is : " + Math.pow(number1,2);
                         }

                            public String exponent()
                            {
                                return number1+" Raised to the power of "+number2+" is " +Math.pow(number1,number2);
                            }
                                public String squareRoot()
                                {
                                     return"the square root of num1 is : " + Math.sqrt(number1);
                                 }
                                    public String calculateSin()
                                    {
                                        return "the sign of num1 is : " + (Math.sin(Math.toRadians(number1)));
                                    }

                                        public String calcutaleCosine ()
                                        {
                                            return "the cosine of num 1 is : " + (Math.cos(Math.toRadians(number1)));
                                        }




    //-----------
}
