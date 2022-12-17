//Create a Java software that will either positive or negative
import java.util.Scanner;
public class Positive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(number<=0){
            System.out.print("The number is negative.");
        }
        else{
            System.out.print("The number is positive.");
        }
    }
}
