/*The user enters either 'A', 'B' or 'C'. If 'A' is entered, the program should display
the word 'Apple'. If 'B' is entered, it displays 'Banana'. and if 'C' is entered,it displays
'Coconut'. Use nested if statedments for this
*/
import java.util.Scanner;
public class User {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        char = 'a', 'c';
        if(word == 'a'){
            System.out.print("Apple");
        }
        else if(word == 'c'){
            System.out.print("Coconut");
        }
        else{
            System.out.print("Banana");

        }
    }
}