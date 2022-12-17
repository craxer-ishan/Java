//Write a program to display total surface area and volume of cuboid
import java.util.Scanner;
public class VolumeofCuboid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of cuboid: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of cuboid: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter the height of cuboid: ");
        double height = sc.nextDouble();
        double area = 2 * (length* breadth + length * height + breadth * height);
        double volume = length * breadth * height;
        System.out.println("The total surface of area is " + area);
        System.out.print("The volume of cuboid is " + volume);
    }
}