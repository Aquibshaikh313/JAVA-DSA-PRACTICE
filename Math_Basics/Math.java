//Implement a program that takes two positive integers A and B in the input and prints their LCM.
//Input 5 10
//Output 10

import java.util.*;
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int LCM = 0 ;
      // int n = Math.max(a,b);
      for(int i = Math.max(a,b); i < a*b;i++){
        if(i%a==0 && i%b == 0){
          LCM = i;
          break;
        }
      }
      System.out.print(LCM);
  }
}

//Write a program to input two integers A & B from user and print their HCF.
// Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.
//Input 5 10 
//output 5
import java.util.*;
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int HCF = 0 ;
      int n = Math.min(a,b);
      for(int i = n ; i>= 1 ; i--){
        if(a%i==0 && b%i == 0){
          HCF = i;
          break;
        }
      }
      System.out.print(HCF);
  }
}

for(int i = 0; i < N ; i++){
  for(int j = 0 ; j <= i ; j++){
    print("HI");
  }
}

Inner working:
--------------

When i = 0 → j goes from 0 to 0 → prints 1 time

When i = 1 → j goes from 0 to 1 → prints 2 times

When i = 2 → j goes from 0 to 2 → prints 3 times

When i = N-1 → j goes from 0 to N-1 → prints N times
​

output will be-->
N(N+1)/2