//Write a Java program that prompts a user for their last name and stores it in a variable named last_name;
import java.util.Scanner;
public class Name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first_name:");
        String first_name = sc.nextLine();
        System.out.print("Enter your last_name:");
        String last_name = sc.nextLine();
        System.out.print("The last name is "+last_name);

    }
}
