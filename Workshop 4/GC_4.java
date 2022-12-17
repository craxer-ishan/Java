import java.util.*;
public class GC_4 {
    public static void main(String args[]){  
 
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
          hash_map.put(1,"Ram");
        hash_map.put(2,"Hari");
        hash_map.put(3,"Shyam");
        hash_map.put(4,"Ramesh");
        hash_map.put(5,"Haresh");
             
         // checking collection view of the map
         System.out.println("Collection view is: "+ hash_map.values());
       }
}
