// 8 ii
public class Pattern2 {
    public static void main(String[] args){
        //i for rows and j for coloumns
        //row denotes the number of rows you want to print
        //Outer loop work for rows
        for(int i=1; i<=5; i++){
            //inner loop work for space
            for(int j=5-i; j>1; j--){
                //prints space between stars
                System.out.print( " ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println( );
        }
    }
}
