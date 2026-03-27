//Number pattern

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count = 1 ;

    for(int i = 1 ; i <= n ; i++){
      for(int j = 1 ; j <= i ; j++){
        System.out.print(count + " ");
        count++;
      }
      System.out.println();
    }
  }
}

//Number patter2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
     
    //Approach 1:
    // for(int i = 1 ; i <= n ; i++){
    //     int count = 1 ;
    //   for(int j = 1 ; j <= i ; j++){
        
    //     System.out.print(count+ " ");
    //     count++;
    //   }
    //   System.out.println();
    // }

    //Approach 2
     for(int i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <= i ; j++){
        
        System.out.print(j+ " ");
        
      }
      System.out.println();
    }
    
  }
}

//Number pattern 3
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
6 7 8 9 10 11 

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    for(int i = 1 ; i <= n ; i++){
      int val = i;
      for(int j = 1 ; j <= i ; j++){
        System.out.print(val + " ");
         val++;
      }
       
      System.out.println();
    }
  }
}


//Star and space pattern 
*_ _ *
*_ _ *
*_ _ *

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for(int i = 1 ; i <= n ; i++){
      System.out.print("*");
      for(int j = 1 ; j <=n - 1 ; j++){ //n-1 bcz the spaces are less than n by 1
          System.out.print("_ ");
      }
      System.out.println("*");
    }
    
  }
}

//star and reducing space pattern

*______*
*_____*
*____*
*___*
*__*
*_*
**

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for(int i = 1 ; i <= n ; i++){
      System.out.print("*");
      for(int j = 1 ; j <= n-i ; j++){ 
          System.out.print("_");
      }
      System.out.println("*");
    }
    
  }
}

//pattern pb
____*
___**
__***
_****
*****

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

   for(int i = 1 ; i <= n ; i++){
     for(int j = 1 ; j<= n-i ; j++){
      System.out.print("_");
     }
     for(int j = 1 ; j <= i ; j++){
      System.out.print("*");
     }

     System.out.println();
   }
    
  }
}