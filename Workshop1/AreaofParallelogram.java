//Write a program to display area of parallelogram
import java.util.Scanner;
public class AreaofParallelogram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a base of parallelogram:");
        double base = sc.nextDouble();
        System.out.print("enter a height of parallelogram:");
        double height = sc.nextDouble();
        double parallelogram = base * height;
        System.out.print("The area of parallelogram is "+parallelogram);
    }
}
