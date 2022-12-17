//Group D --3
import java.util.Scanner;
public class Train {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("You have to wait 13445 seconds late.");
        int total_number_of_second = 13442;
        int number_of_hours = 13442/3600;
        int number_of_minutes =(13442%3600)/60 ;
        int number_of_second = 13442%60;
        System.out.println("13442 Seconds is :"+number_of_hours+" hours "+number_of_minutes+" minutes "+number_of_second+" sec ");
    }
}
