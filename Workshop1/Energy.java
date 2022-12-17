// Write a program to calculate potential energy of body. [PE=MGH where G=9.8]
import java.util.Scanner;
public class Energy{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mass of energy: ");
        double mass = sc.nextDouble();
        System.out.print("Enter the height of the energy:");
        double height = sc.nextDouble();
        double energy = mass * 9.8 * height;
        System.out.println("The potential energy of body is "+energy);

    }
}