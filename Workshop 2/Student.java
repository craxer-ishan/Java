//A student enters the number of college credits.......
import java.util.Scanner;
public class Student {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a college credits: ");
        int credits = input.nextInt();
        if(credits>=90){
            System.out.print(" Senior Status ");
        }
        else if(credits>=60){
            System.out.print(" Junior Status ");
        }
        else if(credits>=30){
            System.out.print("Sophomore Status");
        }
        else{
            System.out.print("Freshman Status");
        }
    }
}
