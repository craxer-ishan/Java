// Group -C (c)
import java.util.Scanner;
public class Infinite {
    public static void main(String[] args){
        while(true)
        {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        if(num<=10){
                break;
            }
        }
    }
}
