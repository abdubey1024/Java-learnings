import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    /*{
        
        int marks = 35;

        if (marks>=30)
        {
            System.out.println("Passed");

        }
        else if (marks>=20 && marks<30)
        {
            System.out.println("Reappear");
        }
        else {
            System.out.println("Backlog");
        }



    }
}  It was an example for && (and) operator

    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue the game? Press 'c' or 'C' to Continue");
        String response = scanner.next();

        if(response.equals("c") || response.equals("C"))
        {
            System.out.println("You can continue");
        }
        else
        {
            System.out.println("You exit the game");
        }

    }
    It was an example for || (or) operator
    */


    {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to quit?");
         String response = scanner.next();
         if(!response.equals("q") && !response.equals("Q"))
         {
             System.out.println("You can continue");
         }
         else {
             System.out.println("You can exit");
         }

    }

}