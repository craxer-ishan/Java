//finding the grades
import java.util.Scanner;
public class Grades {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a marks of English: ");
        int english = input.nextInt();
        System.out.print("Enter a marks of Science: ");
        int science = input.nextInt();
        System.out.print("Enter a marks of Math: ");
        int math = input.nextInt();
        System.out.print("Enter a marks of Social: ");
        int social = input.nextInt();
        System.out.print("Enter a marks of Computer: ");
        int computer = input.nextInt();
        int total_marks = english + science + math + social + computer;
        float percentage = total_marks *100/500;
        System.out.println("Your total marks is "+total_marks);
        System.out.println("Your percentage is "+percentage);
        if(percentage>=90){
            System.out.print("A+");
        }
        else if(percentage>=80){
            System.out.print("A");
        }
        else if(percentage>=70){
            System.out.print("B+");
        }
        else if(percentage>=60){
            System.out.print("B");
        }
        else if(percentage>=50){ 
            System.out.print("C+");
        }
        else{
            System.out.print("Just Pass");
        }
    }
}
