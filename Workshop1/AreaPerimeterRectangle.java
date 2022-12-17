//Write a program to display area and perimeter of rectangle
import java.util.Scanner;
public class AreaPerimeterRectangle{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of rectangle:");
        double length = sc.nextDouble();
        System.out.print("Enter a breadth of rectangle:");
        double breadth = sc.nextDouble();
        double perimeter = 2 * (length + breadth);
        double area = length * breadth;
        System.out.println("The perimeter of rectangle is "+perimeter);
        System.out.println("The area of rectangle is "+area);
    }
}