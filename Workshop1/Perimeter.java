//Write a program to display perimeter of rectangle
import java.util.Scanner;
public class Perimeter {
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the length or rectangle:");
     int length = sc.nextInt();
     System.out.print("Enter the width of rectangle:");
     int width = sc.nextInt();
     int rectangle = 2*(length + width);
     System.out.println("The perimeter of rectangle is "+rectangle);
     
    } 
}
