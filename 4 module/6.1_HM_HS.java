
//find the freq of elements present in queries brute force approach
// Time Complexity: O(N × Q)
public class Main {
  static void findQueries(int[] arr, int[] queries){
    
    for(int i = 0 ; i < queries.length; i++){
      int count = 0 ;
      for(int j = 0 ; j < arr.length ; j++){
        if(arr[j] == queries[i]){
          count++;
        }
      }
       System.out.println(queries[i] + " -> " + count);
    }
   
  }
  public static void main(String[] args) {
     
     int[] arr = {2, 3, 2, 5, 6, 2, 3, 5, 5};
     int[] queries = {2, 3, 5, 6};

     findQueries(arr,queries);
  }
}

//optimize approach using hashmap,hashset
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


//generating all the substring by brute force TC:O(n^3)
import java.util.*;
public class Main {
  static void genSubstring(String str){
    int n = str.length();
    
    
    for(int s = 0 ; s < n ; s++){
      for(int e = s ; e <n ; e++){
        for(int k = s ; k <= e ; k++){
          System.out.print(str.charAt(k));
        }
        System.out.println();
      
      }
    }
  }
  public static void main(String[] args) {
      String str = "pwwkew";

     genSubstring(str);

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