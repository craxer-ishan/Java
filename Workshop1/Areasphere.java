//Write a program to display total surface area of sphere
import java.util.Scanner;
public class Areasphere {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius of sphere:");
        double radius = sc.nextDouble();
        double surface = 4* Math.PI * (radius * radius);
        System.out.println("Surface area of sphere is "+surface);
    }
}
