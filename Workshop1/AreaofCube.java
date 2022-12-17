//Write a program to display total surface area and volume of cube
import java.util.Scanner;
public class AreaofCube {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side of cube: ");
        double side = sc.nextDouble();
        double surface = 6*(side * side);
        double volume = side * side * side;
        System.out.println("Surface area of cube is  "+surface);
        System.out.println("Volume of cube is "+volume);
    }
}
