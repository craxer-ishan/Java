/*Group -C
 1. Wrote a program that 
 a) 
 */
import java.util.Scanner;
public class Loop {
    public static void main(String[] args){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for(num = 100; num<=200; num++){
            if(num%2==0){
                System.out.println(num);
                sum +=num;
            }
        }
        System.out.println("Sum of even number is "+sum);
        }
    }

