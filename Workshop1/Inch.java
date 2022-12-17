//Write a program to ask value in meter and convert into inch
import java.util.Scanner;
public class Inch {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value in meter:");
       double meter = sc.nextDouble();
       double inch = meter * 39.37;
       System.out.println("Value in inch is " + inch);
    }
}
