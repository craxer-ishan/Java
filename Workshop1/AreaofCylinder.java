//Write a program to display total surface area and volume of cylinder
import java.util.Scanner;
public class AreaofCylinder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius of cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter a height of cylinder: ");
        double height = sc.nextDouble();
        double area = 2 * Math.PI * radius * radius + height;
        double volume = Math.PI * radius * radius * height;
        System.out.println("The total surface of area cylinder is "+area);
        System.out.println("The total surface of volume cylinder is "+volume);
    }
}
