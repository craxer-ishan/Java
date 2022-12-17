//Write a program to display total surface area of hemisphere
import java.util.Scanner;
public class Hemisphere {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of hemisphere: ");
        double radius = sc.nextDouble();
        double area = 4 * Math.PI * (radius * radius);
        System.out.print("Surface area of hemisphere is "+ area);
    }
}
