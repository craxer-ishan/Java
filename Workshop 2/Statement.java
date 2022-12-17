// Repeat a sentence (a) using an (if statement with "else if" pairs instead)
import java.util.Scanner;
public class Statement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age<=18){
            System.out.print("You are not eligible to vote.");
        }
        else if(age>=50){
            System.out.print("Your are too old.");
        }
        else{
            System.out.print("You are eligible to vote.");
        }
    }
}
