//Write a program to display volume of cylinder
import java.util.Scanner;
public class VolumeofCylinder {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a radius of cylinder:");
    double radius = sc.nextDouble();
    System.out.print("Enter a height of cylinder:");
    double height = sc.nextDouble();
    double volume = Math.PI * radius * radius * height;
    System.out.print("Enter a volume of cylinder is "+volume);
  }  
}
