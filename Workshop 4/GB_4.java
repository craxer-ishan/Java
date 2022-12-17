public class GB_4 {
    public static void main(String[] args){
        //initialize array
        int[] arr = new int[]{ 25,35,85,75,65};
        
        //Initialize max with first element of array
        int max = arr[0];

        //loop throug the array
        for(int i=0;i<arr.length; i++){

            //Compare elements of array with max
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Largest element is "+max);
    }
}
