//Two integer number and display the results following arithmetic
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int first= input.nextInt();
        System.out.print("Enter a second number: ");
        int second= input.nextInt();
        int add = first+second;
        int sub = first-second;
        int multi = first*second;
        int div = first/second;
        int mod = first%second;
        int expo = first*second*first*second;
        System.out.println("Addition is "+add);
        System.out.println("Subtraction is "+sub);
        System.out.println("Multiplication is "+multi);
        System.out.println("Division is "+div);
        System.out.println("Modulus is "+mod);
        System.out.println("Expnentiation is "+expo);

    }
}
