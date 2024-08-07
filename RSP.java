


import java.util.*;


public class RSP
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice");
        String a = s.nextLine().toUpperCase();;

        Random r = new Random();
        int b = r.nextInt(3);

        String c;
        if(b==1)
        {
            c="ROCK";
        }
        else if(b==2)
        {
            c="PAPER";
        }
        else
        {
            c="SCISSORS";
        }

        if ( a.equals("ROCK") && c.equals("SCISSORS" )||a.equals("SCISSORS") && c.equals("PAPER" )|| a.equals("PAPER") && c.equals("ROCK" ))
            {
                System.out.println("U WIN");
            }

         else if ( c.equals("ROCK") && a.equals("SCISSORS" )||c.equals("SCISSORS") && a.equals("PAPER" )|| c.equals("PAPER") && a.equals("ROCK" ))
            {
                System.out.println("COMPUTER WINS");
            }
        else
        {
            System.out.println("its a TIE");
        }
    System.out.println("COMPUTERS CHOICE " +c);
    }


}
