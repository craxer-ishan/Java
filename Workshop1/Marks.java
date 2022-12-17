//Write a program to ask the user to enter the marks in any four subject and display whether the user is pass or fail.
import java.util.Scanner;
public class Marks {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks in english:");
        int english = sc.nextInt();
        System.out.print("Enter the marks in math:");
        int math = sc.nextInt();
        System.out.print("Enter the marks in science:");
        int science = sc.nextInt();
        System.out.print("Enter the marks in social:");
        int social = sc.nextInt();
        int total = english + math + science + social;
        double percentage = total/4.0;
        if (percentage >= 30)
        {
            System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
}
