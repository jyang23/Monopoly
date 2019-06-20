import java.util.Random;
import java.util.Scanner;

public class Main {

    //Function to roll the dice
    public static int dice_roll()
    {
        Random r = new Random();
        int roll = 1 + r.nextInt(6);
        return roll;
    }

    //Welcome screen to the user
    public static void welcome(int c)
    {
        Scanner in = new Scanner(System.in);

        int roll1;
        int roll2;
        //Testing
        //int roll1 = 3;
        //int roll2 = 3;
        int total_roll;
        //String end = "GAME OVER";

        System.out.println("Please press any key and hit enter to roll your first dice");
        in.next();
        roll1 = dice_roll();
        System.out.println("Your first roll is: "+roll1);

        System.out.println("Please press any key and hit enter to roll your second dice");
        in.next();
        roll2 = dice_roll();
        System.out.println("Your second roll is: "+roll2);

        System.out.println("User rolls "+roll1+" & "+roll2);

        total_roll = roll1 + roll2;

        if(roll1 == roll2)
        {
            System.out.println("DOUBLES!");
            System.out.println("Move "+total_roll+" Spaces and roll again getting...");
            c++;
            System.out.println(c);
            if(c == 3)
            {
                System.out.println("GO TO JAIL --->");
            }
            else {
                welcome(c);
            }
        }
        else
        {
            System.out.println("Move "+total_roll+" Spaces and stop");
        }
    }


    public static void main(String[] args) {

        //Variable to keep count of if a double is rolled three times
        int count = 0;
        System.out.println("Hello, welcome to the game of MONOPOLY!");

        welcome(count);
    }
}
