//4.
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.print("The value of factorial is "+fact);
    }
}
