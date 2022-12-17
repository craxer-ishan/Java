//3. Multiplication
import java.util.Scanner;
public class Positive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int num = input.nextInt();
        int multi =1;;
        for (int i=0; i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
        }
}

