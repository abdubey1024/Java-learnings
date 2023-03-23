//Make a program that takes the radius of a circle as input, calculates its diameter, circumference and area and prints it as output to the user.

import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your radius");

        int x= sc.nextInt();
        double pi= 3.14 ;
        System.out.println(pi);
        int diameter= 2*x;
        double circumference= 2*pi*x;
        double area= pi*x*x;

        System.out.println("The diameter is: "+ diameter);
        System.out.println("The circumference: "+ circumference);
        System.out.println("The area is: "+ area);
    }

}
