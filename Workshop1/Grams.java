//Write a program to ask in kilogram and convert into grams
import java.util.Scanner;
public class Grams {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of kilogram: ");
        double kilogram = sc.nextDouble();
        double grams = kilogram * 1000;
        System.out.println("The kilogram convert into gram is "+grams);
    }
}
