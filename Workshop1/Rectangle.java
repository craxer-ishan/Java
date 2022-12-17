//Write a program to display area of rectangle
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of rectangle:");
        int length = sc.nextInt();
        System.out.print("Enter a breadth of rectangle: ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("The total area of rectangle is " + area);
    }
}
