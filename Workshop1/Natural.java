//Write a program to ask n number and print the sum of first n natural numbers
import java.util.Scanner;
public class Natural {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int sum = 0; 
        for (int i=1; i<=number; i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first " + number +" natural numbers is"+ sum);
    }
}
