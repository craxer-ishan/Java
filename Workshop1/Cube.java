//Write a program to dsiplay total surface area of cube
import java.util.Scanner;
public class Cube {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side:");
        double side = sc.nextDouble();
        double area = 6 *  (side * side);
        System.out.print("The total surface area of cube is " + area);
    }
}
