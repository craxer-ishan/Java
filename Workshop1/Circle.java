//Write a program to display circumference of circle
import java.util.Scanner;
public class Circle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius of circle: ");
        double radius = sc.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of Circle is " + circumference);
    }
}
