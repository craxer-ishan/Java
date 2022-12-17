//9
import java.util.Scanner;
public class Customer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Tell me what you want: ");
        String tell = input.nextLine();
        System.out.print("Enter 1-3 according to your size: ");
        int size = input.nextInt();
        switch(size){
            case 1:
            System.out.println("You have to wear large size");
            break;
            case 2:
            System.out.println("You have to wear small size ");
            break;
            case 3:
            System.out.println("You You have to wear medium size");
            break;
        }
    }
}
