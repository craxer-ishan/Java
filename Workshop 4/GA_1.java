//Group A.
//a. Give the index values of all the odd numbers assuming zero-based indexing.
import java.util.Scanner;
public class GA_1{
    public static void main(String[] args){
        int [] arr = {0,1,3,5,7,9,11};
        System.out.println("The odd number:");
        for(int i=0; i<arr.length; i=i+2){
            System.out.println(arr);
        }
    }
}