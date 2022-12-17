//Write a program to inpurt distance in meter and convert into kilometer and meter
import java.util.Scanner;
public class Meter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double distance = sc.nextDouble();
        double kilometer = distance / 1000;
        double meter = distance % 1000;
        System.out.println("The distance in kilometer is "+ kilometer);
        System.out.print("The distance in meter is "+meter);
    }
}
