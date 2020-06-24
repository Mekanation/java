package exercise2;

import java.util.Arrays;

class Types {
    //    This class has syntax errors, that will prevent your other classes from running.  So... work on this file first to resolve the issues.
    private static int number;
    private static int[] myArray = {3, 4, 5, 6, 76, 12, 2};
    private static String movieA = "Harry and the Hendersons";
    private static String movieB = "Star Wars";
    private static char male = 'm';
    private static char female = 'f';

    //the above instance variables have mistakes with their data types.  Fix the data types so the main method correctly displays the value of all of the variables


    public static void main(String[] args) {
        System.out.println("There are variables that have been declared in this Accessible class.  Fix the code so that all the variables can be accessed by the main method.  print out the values of every variable once the code has been refactored.");
        System.out.println("Types{" +
                "number=" + number +
                ", myArray=" + Arrays.toString(myArray) +
                ", movieA='" + movieA + '\'' +
                ", movieB='" + movieB + '\'' +
                ", male=" + male +
                ", female=" + female +
                '}');

    }
}