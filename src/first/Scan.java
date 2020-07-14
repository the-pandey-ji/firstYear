package first;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        //creating object of scanner
        Scanner object= new Scanner(System.in);
        System.out.println("enter your name");
        //declaring string object to store name
        String name = object.nextLine();
        System.out.println("enter your age");
        //byte -128 to 0 to 127
        byte age = object.nextByte();
        System.out.println("enter a four digit code");
        short code = object.nextShort();
        System.out.println("enter your cpi");
        double cpi = object.nextDouble();
        System.out.println("enter the mob no.");
        double mobileNumber = object.nextLong();
        System.out.println("enter the status pass or fail");
        boolean passed = object.nextBoolean();
        //output
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("4 digit"+code);
        System.out.println("cpi"+cpi);
        System.out.println("name"+passed);

    }
}
