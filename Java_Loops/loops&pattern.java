import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    // Given a number N, store its reverse in another 
    // variable and print that variable. 

    //  Scanner scn = new Scanner(System.in);
    //  int N = scn.nextInt();
    //  int digit = scn.nextInt();
    //  if(digit >= 1 && digit <= 9){
    //    N = N*10 + digit ;
    //      System.out.print(N);

    //  }
    //  else{
    //   System.out.print("cant be added since two digit no.");
    //  }

// Initialize a variable rev = 0 and one by one take the last digit of N 
// and add it to rev as shown below.

// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
//  int rev = 0;

// while(n>0){
//   int digit = n%10;
//   rev = rev*10 + digit;
//   n/= 10;
// }
// System.out.print(rev + " ");

// Scanner scn = new Scanner(System.in);
// int T = scn.nextInt();
// for(int i = 1; i<= T;i++){
//   int n = scn.nextInt();
//   int copy = n;
//   if(n<0){
//     n = n* -1;
//   }
//   int rev = 0;
//    while(n>0){
//     int d = n%10;
//     rev = rev*10 + d;
//     n = n/10;

//    }

//Palindrome 
//   //  if(copy < 0){
//   //   rev = rev* -1;

//   //  }
//    if(rev == copy){
//     System.out.println("Palindrome");
//    }else{
//     System.out.println("Not Palindrome");
//    }
// }

//N number of stars in row
// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// for(int i = 1; i<=N ; i++){
//   System.out.print(" * ");
// }

//Square patter 
// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
//  for(int i=1; i<=4; i++){
//   for(int j =1;j<=4;j++){
//     System.out.print(" * ");
//   }
//   System.out.println();

//  }

//rectangle pattern N and M. N=4 ,M=3
// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// int M = scn.nextInt();

// for(int i = 1; i<=N; i++){
//   for(int j = 1; j<=M ; j++){
//      System.out.print(" * ");
//   }
//   System.out.println();
// }


//Staircase pattern
// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// for (int i =1;i<=N; i++){
//   for(int j=1;j<=i;j++){
//     System.out.print(" * ");
//   }
//     System.out.println();
// }

// Reverse staircase pattern
// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// for(int i=1; i<=N; i++){
//   for(int j=1;j<=N+1-i;j++){
//     System.out.print(" * ");
//   }
//   System.out.println();
// }


// Alternate method
// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// for(int i=1; i<=N; i++){
//   for(int j=N;j>=i;j--){
//     System.out.print(" * ");
//   }

//   System.out.println();
// }


    
}
}