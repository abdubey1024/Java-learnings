import java.util.Scanner;
public class Main{

    public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        if(age>=35)
        {
            System.out.println("You are an uncle now");
        }
        else if (age<=13){
            System.out.println("You are a teenager");
        }
        else if (age>=25){
            System.out.println("Congrats! You are an adult now.");
        }
        else if (age==21){
            System.out.println("You a teen tone twenty one ");
        }

        else {
            System.out.println("You are not an adult!");
        }

    }
}