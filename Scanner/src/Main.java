import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hey " +name);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Which course are you currently pursuing?");
        String course = scanner.nextLine();

        System.out.println("What is your college name?");
        String college = scanner.nextLine();
        System.out.println(college+ " is one of the best colleges in India!");



    }
}