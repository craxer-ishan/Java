//3
import java.util.Scanner;
public class Boolean {
    
        public static void main(String[] args){
            boolean result = true && true;
            boolean result_1 = true && false || true;
            boolean result_2 = false && false || true;
            boolean result_3 = false && false;
            boolean result_4 = !(false) && true;
            boolean result_5 = !(true && !(false && false));
            boolean result_6 = (10 > 14) && (4 == 5);
            boolean result_7 = (3 * 4) != (14 - 2) && ('C' >= 'D');
            boolean result_8 = (12 * 2) == (3 * 8);
            boolean result_9 = (14 * 2) != (3 * 8);
            System.out.println(result);
            System.out.println(result_1);
            System.out.println(result_2);
            System.out.println(result_3);
            System.out.println(result_4);
            System.out.println(result_5);
            System.out.println(result_6);
            System.out.println(result_7);
            System.out.println(result_8);
            System.out.println(result_9);
        }
    }
    

