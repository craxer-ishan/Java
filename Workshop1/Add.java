//Write a program to add a two number and ask for user:
import java.util.Scanner;
public class Add {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a first number: ");
        int first = sc.nextInt();
        System.out.print("enter a second number: ");
        int second = sc.nextInt();
        int third = first + second;
        System.out.print("The sum of value is "+ third);
    }
}
