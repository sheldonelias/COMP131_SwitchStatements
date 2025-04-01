import java.util.Random; //used to create a random seed
import java.util.Scanner;

public class Program
{


    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println(compareSwitchWithIf());
        //usingBreakAndDefault();
        //switchForMonth();

        /*
        System.out.print("Enter a demonination: ");
        denomination = scnr.nextInt();

        if(checkIfCoinExists(denomination))
        {
            System.out.println(" Yes, there is a coin of denomination: " + denomination + ".");
        }else
            System.out.println(" No, there is not a coin of denomination: " + denomination + ".");
        */

        /*

        System.out.println("Enter your toll road segment destination.");

        String segmentDestination = scnr.next();

        System.out.println("Your total toll is: $" + tollRoad(segmentDestination.charAt(0)));


         */

    }

    static Boolean checkIfCoinExists(int denom)
    {
        Boolean doesExist = false;

        //System.out.println("checkIfCoinExists() | 1");

        switch (denom)
        {
            case 1:
                doesExist = true;
                break;
            case 5:
                doesExist = true;
                break;
            case 10:
                doesExist = true;
                break;
            case 25:
                doesExist = true;
                break;
            case 100:
                doesExist = true;
                break;
            default:
        }

        return doesExist;
    }


    static int tollRoad(char roadSegment)
    {
        int cost = 0;

        switch (roadSegment)
        {
            case 'a':
                System.out.println("Pay $1 for segment a.");
                cost += 1;
            case 'b':
                System.out.println("Pay $2 for segment b.");
                cost += 2;
                break;
            default:

        }

        return cost;
    }

    //Use switch for a known set of discrete values
    static public String compareSwitchWithIf()
    {
        System.out.print("Enter a coin denomination:");
        int denom = scnr.nextInt();
        String coinName = "this works";

        if(denom == 25)
        {
            coinName = "quarter";
        } else if(denom == 10)
        {
            coinName = "dime";
        } else if (denom == 5)
        {
            coinName = "nickel";
        } else if (denom == 1)
        {
            coinName = "penny";
        } else
            coinName = "invalid denom";


        //Create a switch statement where the user inputs a
        //coin denomination and returns the name of the coin

        switch(denom)
        {
            case 25: coinName = "quarter";
                break;
            case 10: coinName = "dime";
                break;
            case 5: coinName = "nickel";
                break;
            case 1: coinName = "penny";
                break;
            default:
                coinName = "no such coin";
        }


        return coinName;
    }

    //
    static public void usingBreakAndDefault()
    {
        System.out.println("Welcome to the Random Alphabet Soup app. " +
                "Enter how many letters you want in your soup up to 3.");
        int switchArg = scnr.nextInt();

        String soupLetters = "";

        Random rand = new Random();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        switch(switchArg)
        {
            case 3: soupLetters += alphabet.charAt(  rand.nextInt(26)   );
            case 2: soupLetters += alphabet.charAt(rand.nextInt(26));
            case 1: soupLetters += alphabet.charAt(rand.nextInt(26));
                break;
            case 0: System.out.println("Your soup will have not have a letter. You entered 0.");
            default: System.out.println("Invalid entry.");
        }

        System.out.println("Your soup will have these letter: " + soupLetters );

    }

    //The parameter variable monthNum is used as the switch argument value.
    static public void switchForMonth(int monthNum)
    {
        //Declare variable to initialize in each case
        String monthString;
        //switch argumnent value monthNum must match one case value 1...12
        switch (monthNum) {
            case 1:  monthString = "January";
                break;
            case 2 :  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }
}
