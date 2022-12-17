//Write a program to input selling price and cost price calculate profit or loss percentage
import java.util.Scanner;
public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the selling price:");
        int sellingPrice = sc.nextInt();
        System.out.print("Enter the cost price:");
        int costPrice = sc.nextInt();
        int profit = (sellingPrice - costPrice) / costPrice * 100;
        System.out.println("Profit or loss percentage is " + profit);
    } 
}
