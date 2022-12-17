import java.util.ArrayList;
// Group B-1.
import java.util.Scanner;
public class GB_1 {
   public static void main(String[] args) {
    System.out.print("Enter a integer");
    Scanner input = new Scanner(System.in);
    int in = input.nextInt();
      ArrayList<String> aList = new ArrayList<>();
      aList.add ("1");
      aList.add ("2");
      aList.add ("3");
      aList.add("4");
      aList.add("5");
      if(aList.contains("1"))
         System.out.println("The element 1is available in the ArrayList");
      else
         System.out.println("The element 1 is not available in the ArrayList");
      if(aList.contains("2"))
         System.out.println("The element 2 is available in the ArrayList");
      else
         System.out.println("The element 2 is not available in the ArrayList");
   }
}

