//Write a program to input the day and display whether the day is Saturday or not.
import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day:");
        int day = sc.nextInt();
        if (day == 6) {
            System.out.println("Day is Saturday");
        } else {
            System.out.println("Day is not Saturday");
        }
    }
}
