//2 Floor
import java.util.Scanner;
public class Floor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ask the floor number: ");
        int number = input.nextInt();
        int floor;
        if(number<=10){
            System.out.print("You are going in your actual floor." );
        }
        else if (number == 15){
            System.out.print("This is not actual floor ");
        }
        else{
            System.out.print("The actual floor is: "+number);
        }
    }
}
