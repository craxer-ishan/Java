//Find the difference between 7 factorial and 5 factorial
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number =sc.nextInt();
        int i , fact=1;
        for (i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
