//Write a program to calculate distance [S=UT+1/2(AT^2)]
import java.util.Scanner;
public class Calcudistance {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the speed:");
        double speed = sc.nextDouble();
        System.out.print("Enter the time:");
        double time = sc.nextDouble();
        System.out.print("Enter the acceleration:");
        double acceleration = sc.nextDouble();
        double distance = speed * time + 0.5 * acceleration * (time * time);
        System.out.print("Distance is " +distance);
    }
}
