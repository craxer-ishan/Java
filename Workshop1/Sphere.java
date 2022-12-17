//Write a program to display colume of Sphere
import java.util.Scanner;
public class Sphere{
    public static void main(String[] args)
    {
        System.out.println("Enter the volume of sphere");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere is " + volume);
    }
}