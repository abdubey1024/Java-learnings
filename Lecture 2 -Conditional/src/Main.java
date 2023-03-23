import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

      /*  A program that tells if you are adult or not:-

      System.out.println("Enter your age:");
        int a=sc.nextInt();

        if(a>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        } */

        /* A program that tells given number is even or odd:-
        System.out.println("Enter your number:");
        int x= sc.nextInt();

        if(x%2==0){
            System.out.println(x + " is an even number.");
        }
        else{
            System.out.println(x + " is an odd number");
        } */

        /* A program that tells whether 2 numbers are equal, greater or lesser

        System.out.println("Enter First number:");
        int x= sc.nextInt();
        System.out.println("Enter second number");
        int y=sc.nextInt();

        if(x == y){
            System.out.println("The numbers are equal to each other");
        }
        else if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else{
            System.out.println(x+" is lesser than "+ y);
        } */

        /* A program where, press 1 for "Hello, press 2 for "Namaste" & press 3 for "Bonjour"

        System.out.println("Press 1,2 or 3");
        int x=sc.nextInt();

        switch(x){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3: System.out.println("Bonjour");
                break;
            default:
                System.out.println("You have pressed an INVALID number");

        }    */

        /* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
	1 : + (Addition) a + b
    2 : - (Subtraction) a - b
    3 : * (Multiplication) a * b
    4 : / (Division) a / b
    5 : % (Modulo or remainder) a % b
    Calculate the result according to the operation given and display it to the user.  */

        /* System.out.println("Enter first number");
        int x= sc.nextInt();

        System.out.println("Enter the symbol");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int y= sc.nextInt();

        if(a==1){
            int z= x+y;
            System.out.println(z);
        }
        else if(a==2){
            int z=x-y;
            System.out.println(z);
        }
        else if(a==3){
            int z=x*y;
            System.out.println(z);
        }
        else if(a==4){
            int z= x/y;
            System.out.println(z);
        }
        else if(a==5){
            int z= x%y;
            System.out.println(z);
        }
        else{
            System.out.println("Invalid Operation");
        } */





    //Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

       /* System.out.println("Enter the number of the month");
        int x= sc.nextInt();

        switch (x){
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid number");

        } */




    }
}