// Problem Statement
// Given an integer A, you need to find the count of it's factors.
// Factor of a number is the number which divides it perfectly leaving no remainder.
// Example : 1, 2, 3, 6 are factors of 6

import java.util.*;
public class Main {
  static int Solve(int A){
    int count = 0 ;
   for(int i = 1 ; i*i <= A ; i++){
    if(A%i == 0 ){
      if(i == A/i){
        count ++;

      }else{
        count += 2;
      }
    }
   }
   return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();

    System.out.println(Solve(A) );
  }
}

// Problem Description
// Given a number A. Return 1 if A is prime and return 0 if not. 
// Note : 
// The value of A can cross the range of Integer.

import java.util.*;

public class Main {
  static int Solve(int A){
    int count = 0 ;
   for(int i = 1 ; i*i <= A ; i++){
    if(A%i == 0 ){
      if(i == A/i){
        count ++;

      }else{
        count += 2;
      }
    }
   }
   return count;

   
  }
   static int checkPrime(int A){
    int fact = Solve(A);
    if(fact   == 2) {
      return 1;
    }else {
      return 0;
    }
   }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();

    System.out.println(Solve(A) );
    System.out.println(checkPrime(A));
  }
}

// Problem Description
// You are given an integer A. You have to tell whether it is a perfect number or not.
// Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
// A proper divisor of a natural number is the divisor that is strictly less than the number.


import java.util.*;
public class Main {

  static int  Solve(int A){
      int count = 0;
    for (int i = 1 ; i < A ; i++){
          if(A%i == 0){
       count = count + i;
       
    }
    
    }
    return count;

  }
  static boolean PerfNums(int A){
    int fact = Solve(A);
     if(fact == A){
      return true;
    }else{
      return false;
    }
  }


  public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int A = scn.nextInt();

     System.out.println(PerfNums(A));
  }
}


for (int i = 1; i <= n; i++)
{
    for (int j = 1; j <= 3 ^ i; j++)
    {
        print(i + j);
    }
}

// 3 + 9 + 27 + …. + 3^n times.