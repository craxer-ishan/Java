//Write a program to display area and perimeter of square
import java.util.Scanner;
public class Areaofsquare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square:");
        double side = sc.nextDouble();
        double perimeter = 4 * side;
        double area = side * side;
        System.out.println("Perimeter of square is " + perimeter);
        System.out.println("Area of square is " + area);
    }  
}
