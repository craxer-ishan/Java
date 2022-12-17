//Write a program to ask distance in kilometer and convert into miles
import java.util.Scanner;
public class Kilo {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a distance kilometer: ");
    double kilometer = sc.nextDouble();
    double convert = kilometer * 0.621371;
    System.out.println("The distance in miles is "+convert);
  }  
}
