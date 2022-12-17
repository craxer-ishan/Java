//Write a program to display total surface area cylinder
import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter a height of cyclinder: ");
        double height = sc.nextDouble();
        double total = 2*Math.PI *radius*height + 2* Math.PI * radius * radius;
        System.out.print("The total surface of cylinder is " +total);
    }   
}
