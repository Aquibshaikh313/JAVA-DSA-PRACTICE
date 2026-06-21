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



// pair equal to target
import java.util.*;
public class Main {
  static boolean targetSum(int[] arr, int k){
    int n = arr.length;
    HashSet<Integer> hs = new HashSet<>();

    for(int i = 0 ; i < n ; i++){
      int target = k - arr[i];
      if(hs.contains(target)){
        return true;
      }

      hs.add(arr[i]);
      System.out.print(hs); //hs -> stores the values inside hashset until the condition is met
    }
    return false;
  }

  public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,6};
    int k = 7;
    
    System.out.print(targetSum(arr,k));
  }
}


//counting pairs whose sum is equal to k
import java.util.*;
public class Main {
  static int countPairs(int[] arr,int k){
    int n = arr.length;
    int count = 0;

    HashMap<Integer,Integer> hm = new HashMap<>();
    
    for(int i = 0 ; i < n ; i++){
      int target = k - arr[i];
      if(hm.containsKey(target)){
        int freq = hm.get(target);
        count += freq;
      }

       //insert arr[i]
      if(hm.containsKey(arr[i])){
        int freq = hm.get(arr[i]);
        hm.put(arr[i],freq+1);
      }else{
        hm.put(arr[i],1);
      }
    }

    return count;

   
  }
  

  public static void main(String[] args) {

    int[] arr = {2,5,2,5,8,5,2,8};
    int k = 10;
    
    System.out.print(countPairs(arr,k));
  }
}

// prefix sum == 0
import java.util.*;
public class Main {
  static boolean solve(int[] arr){
    int n = arr.length;
    int[] pf = new int[n];
     
     pf[0] = arr[0];
     HashSet<Integer> hs = new HashSet<>();
     
     hs.add(pf[0]);

     for(int i = 1; i < n ; i++){
      pf[i] = pf[i-1] + arr[i];

       hs.add(pf[i]);
     }
     
    

     if(hs.size() != pf.length){
      return true;
     }
     return false;

  }
  public static void main(String[] args) {
      int[] arr = {2,2,1,-3,4,3,1,-2,-3,2};

      System.out.print(solve(arr));
  }
}


//Subarray sum equal to k

import java.util.*;

public class Main {
  static boolean subarrSumEquToK(int[] arr,int k){
    int n = arr.length;
    HashSet<Long> hs = new HashSet<>();
    
    //Handling edge case
    hs.add(0L); 
    long a = 0; //prefix

    for(int i = 0 ; i < n ; i++){
      a += arr[i];
      long target = a - k;

      if(hs.contains(target)){
        return true;
      }
      hs.add(a);

    }
    return false;
    
  }
  public static void main(String[] args) {
     int[] arr = {2,3,9,-4,1};
     int k = 10;

     System.out.print(subarrSumEquToK(arr,k));
  }
}