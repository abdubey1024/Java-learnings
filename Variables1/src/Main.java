import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String x = "Kumar";
        String y = "Abhishek";
        String temp = "null";

        temp = x;
        x=y;
        y=temp;
        System.out.println("x:" +x);
        System.out.println("y:" +y);
    }
}