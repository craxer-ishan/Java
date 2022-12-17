//Write a program to display area of 4 walls
import java.util.Scanner;
public class AreaOfWall{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth: ");
        double breadth = sc.nextDouble();
        double area = 2 * (length + breadth);
        System.out.println("The value of area is " + area);
    }
}