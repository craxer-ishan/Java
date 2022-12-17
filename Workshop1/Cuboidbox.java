//Write a program to display total surface are of cuboid/box.
import java.util.Scanner;
public class Cuboidbox {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of length:");
        double length = sc.nextDouble();
        System.out.print("Enter a value of width:");
        double width = sc.nextDouble();
        System.out.print("Enter a number of height:");
        double height = sc.nextDouble();
        double sa = 2 *(length * width )+ 2 *(length * width )+ 2*(length * width);
        System.out.println("The number of value of cuboidbox is "+sa);
    }
}
