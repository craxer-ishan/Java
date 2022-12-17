//Group - D ... 1
import java.util.Scanner;
public class Price {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many copies you want print: ");
        double copy = input.nextInt();
        double a = copy * 0.30;
        double b = copy * 0.28;
        double c = copy * 0.27;
        double d = copy * 0.26;
        double e = copy * 0.25;
        if(0>=99){
            System.out.print(" You price is "+a);
        }
        else if(100<=499){
            System.out.print("your price is "+b);
        }
        else if(500<=799){
            System.out.print("Your price is "+c);
        }
        else if (800<=1000){
            System.out.print("Your price is "+d);
        }
        else{
            System.out.print("Your price is "+e);
        }
    }
}
     
