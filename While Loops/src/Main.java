import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        //while loop= executes a code as long as its condition remains true
        Scanner scanner = new Scanner(System.in);

        String name= "";
        while(name.isBlank()){
            System.out.println("What is your name?");
            name=scanner.nextLine();
        }
        System.out.println("Hello "+ name);
    }

}