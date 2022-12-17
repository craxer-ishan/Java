//Write a program to display volume of cube
import java.util.Scanner;
public class VolumeofCube {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side of cube:");
        double side = sc.nextDouble();
        double volume = side * side * side;
        System.out.println("Volume of cube is " + volume);
 
    }
}
