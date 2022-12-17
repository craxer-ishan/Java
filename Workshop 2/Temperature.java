//Give an instruction that prompts a user for their temperature and stores it as a float in a variable named current_temperature
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your temperature:");
        float current_temperature = input.nextFloat();
        System.out.println("Your current temperature is "+current_temperature);
    }
    
}
