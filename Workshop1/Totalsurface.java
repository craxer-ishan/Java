//Write a program to display total surface area and volume of sphere
import java.util.Scanner;
public class Totalsurface {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of sphere: ");
        double radius = sc.nextDouble();
        double total = 4 * Math.PI * radius * radius;
        double volume = 4/3 * Math.PI * radius * radius * radius;
        System.out.println("The total surface of sphere is " + total);
        System.out.println("The total volume of sphere is "+ volume);
    }
}
