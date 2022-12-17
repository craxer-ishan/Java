//Write a program  to display total surface area and volume of hemisphere
import java.util.Scanner;
public class Areaofhemisphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of hemisphere:");
        double radius = sc.nextDouble();
        double surfaceArea = 4 * Math.PI * (radius * radius);
        double volume = (4.0 / 3.0) * Math.PI * (radius * radius * radius);
        System.out.println("Surface area of hemisphere is " + surfaceArea);
        System.out.println("Volume of hemisphere is " + volume);
    }
}
