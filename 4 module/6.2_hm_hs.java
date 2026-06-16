//Find first non repeating elements -->
import java.util.*;

public class Main {
  static int findFirstUniqElem(int[] arr ){
   
    //Creating a Hashmap and storing values
    HashMap<Integer,Integer> hm = new HashMap<>();
    int n = arr.length;

    //first creating a freq HashMap
    for(int i = 0 ; i < n ; i++){
        if(hm.containsKey(arr[i])){ // this returns T/F

        //get the previous value
        int value = hm.get(arr[i]);

        //insert key,value+1
        hm.put(arr[i],value+1);
           
        }else{
          //if element is occuring first time
         hm.put(arr[i],1);
        }
      }

    for(int i = 0 ; i < arr.length; i++){
      if(hm.get(arr[i]) == 1){
        return arr[i];
        
      }
      
    }
    return -1;

  }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 5};

        System.out.print(findFirstUniqElem(arr));

    }
}