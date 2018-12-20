package yo;
import java.util.Scanner;

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        String h;
        String j;
        System.out.print ("Enter your name:" );
        x = sc.nextLine();
        System.out.print ("Enter your surname:" );
        h = sc.nextLine();
        System.out.print ("Enter your age:" );
        j = sc.nextLine();
        System.out.println ("My name is " + h + "  " + x + ", i'm " + j + " years old" );






    }
}
