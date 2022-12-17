//Write a program to display area and circumference of circle
import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius of circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        double circumference = 2 * Math.PI * radius;
        System.out.println("The area of circle is "+ area);
        System.out.print("The circumference of circle "+circumference);
    }
}
