import java.util.Scanner;
public class GB_2 {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a total students: ");//Ask user to enter number
    int std = input.nextInt();
    /*Declareing array of n elements the value
    of n is provided by the user
     * 
     */
    double[] arr = new double[std];
    double total =0;
    for (int i=0; i<arr.length; i++){
        System.out.print("Enter a marks of physics:"+(i+1+":"));
        arr[i]= input.nextDouble();
    }
    input.close();
    for(int i=0; i<arr.length; i++){
        total = total+arr[i];
    }
    double average = total/arr.length;
    System.out.format("The average is: %.3f",average);
   } 
}
