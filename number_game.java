import java.util.Random;
import java.util.Scanner;
public class number_game {
    public static void main(String args[])
    {
        int answer,guess;
        final int MAX=100;
        Scanner i=new Scanner(System.in);
        Random rand=new Random();
        boolean correct=false;
        answer=rand.nextInt(MAX)+1;
        while(!correct)
        {
            System.out.println("guess a number from 1 to 100");
            guess=i.nextInt();
            if(guess>answer)
            {
                System.out.println("too high try again");

            }
            else if(guess<answer)
            {
                System.out.println("too low, try again");
            }
            else
            {
                System.out.println("yes you guess the number");
            }
            }
            System.exit(0);
        }
    }

