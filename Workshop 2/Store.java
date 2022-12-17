//Develop a system to store your name as variable
import java.util.*;
public class Store {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is stored as a "+name);
    }
}
