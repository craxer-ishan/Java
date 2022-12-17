//Write a program to display cost of painting the four walls of a room
import java.util.Scanner;
public class FourWalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of room:");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of room:");
        double breadth = sc.nextDouble();
        System.out.print("Enter the height of room:");
        double height = sc.nextDouble();
        double cost = (length * breadth * height) / 500;
        System.out.println("Cost of painting the four walls of a room is " + cost);
}
}