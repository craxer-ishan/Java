// Give an instruction that prompts a user for their age and stores it as an integer in a variable named age
import java.util.Scanner;
public class Named {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age:");
        int named_age = input.nextInt();
        System.out.print("Your age is "+named_age);
    }
}
