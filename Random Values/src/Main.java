import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random= new Random();

        int x = random.nextInt(4)+2;
        System.out.println(x);
        double y = random.nextDouble();
        System.out.println(y);

    }
}