//Write a program to display perimeter of square
import java.util.Scanner;
public class PerimeterofSquare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side of square: ");
        double side = sc.nextDouble();
        double perimeter= 4*side;
        System.out.println("The perimeter of square is "+perimeter);
    }
}
