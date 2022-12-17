//Write a program to input principal, rate, time and display simple interest and total amount.
import java.util.Scanner;
public class Principal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal of amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of amount: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time of value: ");
        double time = sc.nextDouble();
        double simpleinterest = (principal * rate * time)/100;
        double totalAmount = principal + simpleinterest;
        System.out.println("The value of simple interest is "+simpleinterest);
        System.out.println("The total amount of value is "+totalAmount);
    }
}
