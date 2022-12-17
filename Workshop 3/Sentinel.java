//Group c 2..
import java.util.Scanner;
public class Sentinel {
    public static void main(String[] args){
    int num;
    int product = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number, or O to stop: ");
    num = input.nextInt();
    while(num!=0){
        product = num * num;
        System.out.println("Enter another number, or O to stop: ");
        num = input.nextInt();
    }
    System.out.println("The product of number is  "+ product);
    }
}
