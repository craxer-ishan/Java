//5.
import java.util.Scanner;
public class Built {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base:");
        int base = input.nextInt();
        System.out.print("Enter exponent:");
        int exp = input.nextInt();
        double result = Math.pow(base,exp);
        System.out.print("Answer = "+result);
    }
}

