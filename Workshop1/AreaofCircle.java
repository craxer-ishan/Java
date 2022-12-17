//Write a program to display area of circle
import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius of circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.print("The area of circle is "+area);
    }
}
