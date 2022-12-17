import java.util.Scanner;
public class Condition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a sentence:" );
        String sentence = sc.nextLine();
        boolean a1 = sentence.equals("a");
        boolean a2 = sentence.equals("b");
        boolean a3 = sentence.equals("c");


        if(a1 ==  true ){
            System.out.println(" Apple");
        }
        else if(a2 ==  true )
        {
            System.out.println(" Banana" );
        }
        else 
        {
            System.out.println(" Coconut" );
        }
    }
}