//Given a square matrix print its anti diagonal elements:

public class Main {
  public static void printDiag(int[][] A,int N){
    int r = 0 ;
    int c = N - 1 ; // we could since its square matix we took N here not M 
    while (r < N){
      System.out.print(A[r][c] + " ");
      r++;
      c--;
    }

  }
  public static void main(String[] args) {
    int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
    int N = A.length;

    printDiag(A,N);
  }
}

// Printing all the diagonals -->

public class Main {
  public static void printDiag(int[][] A){
    int N = A.length;
    int M = A[0].length;
    //Printing all diagonals for row
    // int i = 0;
    for(int j = 0 ; j < M ; j++){
       int r = 0 ; //row
    int c = j ; // col
    while (r < N && c >= 0){
      System.out.print(A[r][c] + " ");
      r++;
      c--;
    }
    System.out.println();

    }

    //Print all the diagonals for last cols M-1
    // int j = M - 1;
    for (int i = 1 ; i < N ; i++){
      int r = i; //row
      int c = M - 1;
      while(r < N && c>= 0){
        System.out.print(A[r][c] + " ");
        r++;
        c--;
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
    int[][] A = {{1,2,3,1},{4,5,6,2},{7,8,9,3}};
    

    printDiag(A);
  }
}

//Insertion Sorting -->
import java.util.Arrays;
public class Main {
  static void insertSort(int[] A){
    int n = A.length;

    for(int i = 0 ; i < n ; i++){
      int currElem = A[i];
      int j = i - 1;
      
      while(j >= 0 && A[j]> currElem){
        A[j+1] = A[j];
        j--;
      }
      A[j+1] = currElem;
    }

  }
  public static void main(String[] args) {

     int[] A = {3,4,1,2,0,-1};
     insertSort(A);
     System.out.print(Arrays.toString(A));
  }
}


//Row to Column Zero -->
//you are given a 2D integer matrix. make all the elements in a row or column zero if the mat[i][j] = 0 . Specifically make the entire i^th row and j^th column zero.

import java.util.Arrays;
public class Main {
   static void markZero(int[][] mat){
   int n = mat.length;
   int m = mat[0].length;

   //iterate all over rows
   for(int i = 0 ; i < n ; i++){
    boolean flag = false;
    for(int j = 0 ; j < m ; j++){
      if(mat[i][j] == 0){
        flag = true;
        break;
      }
    }
    if(flag == true){
     for(int j = 0 ; j < m ; j++){
      if(mat[i][j] != 0){
         mat[i][j] = -1;
      }
     }
    }
   }

   //iterate over cols
   for(int j = 0 ; j < m ; j++){
    boolean flag = false;
    for(int i = 0 ; i < n ; i++){
      if(mat[i][j] == 0){
        flag = true;
        break;
      }
    }
    if(flag == true){
      for(int i = 0 ; i < n; i++){
        if(mat[i][j] != 0){
          mat[i][j] = -1;
        }
      }
    }
   }
   //iterating over the entire matrix -->
   for(int i = 0 ; i < n ; i++){
    for(int j = 0 ; j < m ; j++){
      if(mat[i][j] == -1){
        mat[i][j] = 0;
      }
    }
   }
  }
  public static void main(String[] args) {
      int[][] mat = {
        {1,2,3,4},{0,6,8,9},{1,2,3,0}
      } ;

     markZero(mat);
  System.out.println(Arrays.deepToString(mat));
  }
}
//Output : [[0, 2, 3, 0], [0, 0, 0, 0], [0, 0, 0, 0]]