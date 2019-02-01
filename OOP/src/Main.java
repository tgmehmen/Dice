import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s = new String("Steve");
        String s2= new String("Steve");
        String s3;
        String s4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s3 = scan.nextLine();
        System.out.println("Enter another string");
        s4 = scan.nextLine();
        System.out.println(s3.equals(s4));

        Date d = new Date();
        System.out.println(d);



    }
}
