import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String yes ="";
        while(yes.isBlank()){
            System.out.println("Is it your Birthday?");
            yes= scanner.nextLine();
        }
        for(int i=5; i>=0;i--){
            System.out.println(i);
        }
        System.out.println("Happy Birthday Bro");
    }
}