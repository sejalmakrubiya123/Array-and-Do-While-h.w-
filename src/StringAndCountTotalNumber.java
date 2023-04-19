import java.util.Scanner;

public class StringAndCountTotalNumber {


    public static void main (String[] args)
    {

       //Take input from the user
        Scanner scanner=new Scanner(System.in);

     //declare a variable to count the total number of characters in the given string and initialize it to 0
         int count = 0;
        int i = 0;

        System.out.println("please Enter a String to count characters  = "  );

        // declare a string and user to initialize it.

        String string = scanner.nextLine();

        //use while loop to calculate the total characters in the string

        while (i < string.length())
        {
        // use an if condition to counting space

            if (string.charAt(i) != ' ')
            {
                count++;
            }
            i++;
        }
        //print the total number of characters in the given string

        System.out.println("\nThe Total Number of characters = " + count);

    }


}
