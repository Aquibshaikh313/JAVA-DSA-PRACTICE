
//find the freq of elements present in queries
TC: O(q+n);
SC :O(N);
import java.util.*;
public class Main {
  public static void main(String[] args) {
      int[] arr = {2,6,3,8,2,8,2,3,8,10,6};
      int[] query = {2,8,3,5};

      //creating an hashmap for storing freq
      //elem,freq
      
      HashMap<Integer,Integer> hm = new HashMap<>();

      int n = arr.length;

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

      //iterating over queries and print the answer
      for(int i = 0 ; i < query.length ; i++){
        if(hm.containsKey(query[i])){
          System.out.println(hm.get(query[i]));
        }else{
          System.out.println(0);
        }
      } 
  }
}


// count of distinct elements 
TC: O(N)
SC:O(N)
import java.util.*;
public class Main {
  public static void main(String[] args) {
      int[] arr = {2,5,6,5,4};

      //Creating a HashSet to store the keys
      HashSet<Integer> hs = new HashSet<>();

      for(int i = 0 ; i < arr.length; i++){
        hs.add(arr[i]);

      
      }
      

      System.out.println(hs.size());
      System.out.println(hs);
      

      
     
  }
}

// 3. Longest Substring Without Repeating Characters
// Problem Statement

// Given a string, find the length of the longest substring without repeating characters.
TC : O(N), SC: O(N)

import java.util.*;
public class Main {
  public static void main(String[] args) {
      String str = "pwwkew";

      int s = 0; 
      int e = 0;
      int ans = 0;
      int n = str.length();

      HashSet<Character> hs = new HashSet<>();
      
      while(e < n){
        char ch = str.charAt(e);
        while(hs.contains(ch)){
          hs.remove(str.charAt(s));

          s++;

        }
          hs.add(ch);
          ans = Math.max(ans,e-s+1); //or hs.size();
          e++;
        
      }
      System.out.print(ans);

      
     
  }
}