//Write a program to display area of triangle 
import java.util.Scanner;
public class Areaoftriangle {
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a base of traingle: ");
    double base = sc.nextDouble();
    System.out.print("Enter a height of traingle: ");
    double height = sc.nextDouble();
    double area = base * height;
    System.out.println("The area of traingle is " + area);
   } 
}
