//Write a program to display area of square
import java.util.Scanner;
public class Square {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of square:");
        double length = sc.nextDouble();
        double area = length * length;
        System.out.print("The area of Square is "+area);
    }
}
