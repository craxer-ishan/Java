//Develop a program which tells his grade
import java.util.Scanner;
public class Bruno {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ask the tutor:");
        int tut = input.nextInt();
        int a = 75;
        if(tut==a){
            System.out.print("You got B in your exam");
        }
        else{
            System.out.print("This is not your grade");

        }
        }
}
