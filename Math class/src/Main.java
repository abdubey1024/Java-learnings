import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        double x = 3.14;
        double y = -2;
        double z = Math.max(x,y);
        double u = Math.abs(y);
        double d = Math.sqrt(x);
        double e = Math.round(x); //round off
        double f = Math.ceil(x); //round up
        double g = Math.floor(x); //round down


        System.out.println(z);
        System.out.println(u);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        int a = 443;
        int b = 34;
        int c =  Math.min(a,b);

        System.out.println(c);

        //find the hypotenuse of a right-angled triangle

        Scanner scanner = new Scanner(System.in);

        double h;
        double i;
        double j;

        System.out.println("Enter side 'h' :");
        h = scanner.nextDouble();
        System.out.println("Enter side 'i' :");
        i = scanner.nextDouble();

        j= Math.sqrt((h*h)+ (i*i));
        System.out.println("The value of hypotenuse is 'j' : " +j);


    }
}