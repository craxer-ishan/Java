// lets take an example program where we will take the age of user.
import java.util.Scanner;
public class Ladder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age>=30){
            System.out.print("You are senior.");
        }
        else if(age>=18){
            System.out.print("You are adult.");
        }
        else{
            System.out.print("You are child ");

        }
        }    
    }
