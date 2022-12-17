//Write a program to display volume of hemisphere
import java.util.Scanner;
public class Volumeofhemis {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius of hemisphere: ");
        double radius = sc.nextDouble();
        double volume = 4/3 * Math.PI * radius * radius * radius;
        System.out.println("Volume of hemisphere is "+ volume);
    }   
}
