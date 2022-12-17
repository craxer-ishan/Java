// Group - B //3
public class GB_3 {
    public static void main(String[] args){
        //initialize array
        int [] arr= new int [] {1,2,3,4,5};
        System.out.println("Orginal array: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse order");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
