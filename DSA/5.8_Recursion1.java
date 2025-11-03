
// public class Main {
//   static int factorial(int n){
//     if(n == 0 || n == 1){
//       return 1;
//     }
//     return factorial(n-1) * n;
//   }
//   public static void main(String[] args) {
//       int n = 4;

//       System.out.print(factorial(n));
//   }
// }


public class Main {
  static void printIncrOrd(int n){
    if(n == 0 ){
      return;
    }
    // if(n==1){
    //   System.out.print(1 + " ");
    //   return ;
    // } // even if we dont write this it works fine
     printIncrOrd(n-1);
     System.out.print(n + " ");
  }
  public static void main(String[] args) {
      int n = 4;

    printIncrOrd(n);
  }
}

//Decreasing order pb

//Assignment 

public class Main {
  static int bar(int x , int y){
    if(y == 0) return 0 ;
    return(x + bar(x,y - 1));
  }
  static int foo(int x , int y){
    if(y == 0) return 1;
    return bar(x,foo(x,y-1));
  }
  public static void main(String[] args) {
      System.out.print(foo(3,5));
  }
}


//power of 3 check

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1 || n%3 == 0 && isPowerOfThree(n/3)){
            return true;
        }
        return false;
    }
}