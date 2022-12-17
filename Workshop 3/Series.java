//7.
public class Series {
    public static void main(String[] args){
        int n =10, first=0, second=1;
        System.out.println("Fabonacci Seriest till "+n);
        for (int i=1; i<=n;i++){
            System.out.print(first + ",");

            //compute the next term
            int nextterm = first + second;
            first = second;
            second = nextterm;
        }
    }
}
