//Lets create a buzz program to input a number and check 
import java.util.Scanner;
public class Buzz{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int a = 7;
        if(number%a==0){
            System.out.print("It is buzz");
        }
        else{
            System.out.print("It is not buzz");

        }
    }
}