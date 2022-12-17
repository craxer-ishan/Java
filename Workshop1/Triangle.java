//Write a program to display area of triangle when three sides are given.
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of triangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter a breadth of triangle: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter a height of triangle: ");
        double height = sc.nextDouble();
        double area = (length * breadth * height) /2;
        System.out.println("The are of triangle is "+ area);
    }
}
