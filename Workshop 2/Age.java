//Find the difference between Beth's age (57) and Tom's age(34)
import java.util.Scanner;
public class Age
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int beth = 57;
        int tom  = 34;
        int age = beth - tom;
        System.out.println("The difference between Beth's age and Tom's age is " + age);
    }
}
