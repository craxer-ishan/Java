//Write a program to input principal rate, time and display total amount
import java.util.Scanner;
public class Rate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter a rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter a time: ");
        double time = sc.nextDouble();
        double amount = principal * Math.pow(1+rate/100, time);
        System.out.println("The amount is "+amount);
    }
}
