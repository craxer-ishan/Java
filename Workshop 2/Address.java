//Give a call to printf that is provided one string that displays the following address on three separate lines.
import java.util.Scanner;
public class Address {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String one = input.nextLine();
        System.out.println("John doe \n123 Dudley Street\n123 Dudley Street");
    }
}
