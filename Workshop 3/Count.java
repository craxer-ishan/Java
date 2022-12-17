//6.
import java.util.Scanner;
public class Count{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num>=0){
            System.out.print("It is positive number");
        }
        else if (num<=0){
            System.out.print("It is negative number");
        }
        else{
            System.out.print("You have zero entered.");
        }
    }
}