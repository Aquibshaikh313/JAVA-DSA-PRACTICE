//Rain water trapping ---->
public class Main {
  static int rainWaterTrapping(int[] ht){
    int n = ht.length;
    int[] lmax = new int[n]; //prefix sum array
    int[] rmax = new int[n];//suffix sum array

    

   //left prefix sum
   lmax[0] = ht[0];
   for(int i = 1 ; i < n ; i++){
     lmax[i] = Math.max(lmax[i-1] , ht[i]);
   }

   //rigth prefix sum
   rmax[n-1] = ht[n-1];
   for(int i = n-2 ; i >= 0 ; i--){
    rmax[i] = Math.max(rmax[i+1] , ht[i]);
   }


   //variable for storing water
   int water = 0 ;

   for(int i = 0 ; i < n ; i++){
    int lm = lmax[i];
    int rm = rmax[i];
    int h = ht[i];

    water += Math.min(lm,rm)- h;
   }
   return water;

  }
  public static void main(String[] args) {
     int[] ht = {2,1,3,2,1,2,4,3,2,1,3,1};

    System.out.print(rainWaterTrapping(ht)) ;
  }
}


//searching in the matrix -->
public class Main {
  static boolean searchInMatrix(int[][] matrix,int k){

    int r = matrix.length;
    int c = matrix[0].length;
    // for(int i = 0 ; i < r ; i++){
    //   for(int j = c-1 ; j >= 0 ; j--){
    //     if(matrix[i][j] == k){
    //       return true;
    //     }else if(matrix[i][j] > k){
    //       j--; //go left
    //     }else{
    //       i++; //go bottom
    //     }
    //   }
    // }
    // return false;

    //same pb using while loop
    int i = 0 , j = c - 1 ;
    while (i < r && j >= 0){
      if(matrix[i][j] == k){
        return true;
      }else if( matrix[i][j] > k){
       j--;
      }else{
        i++;
      }
    }
    return false;
  }
  public static void main(String[] args) {
     int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int k = 5;

    System.out.print(searchInMatrix(matrix,k));

  }
}


//Printing boundary of a square matrix -->
// import java.util.Arrays;
public class Main {
  static void printBoundary(int[][] mat){
    
    //since it is a square matrix
    int n = mat.length;
   
    //top row
    for(int i = 0 ; i < n ; i++){
      System.out.print(mat[0][i] + " ");
    }

    //right column
    for(int i = 1 ; i < n ; i++){
      System.out.print(mat[i][n-1] + " ");
    }

    //bottom row
    for(int i = n-2; i >= 0 ; i--) {
      System.out.print(mat[n-1][i] + " ");
    }

    //left column
    for(int i = n - 2 ; i > 0  ; i--){
      System.out.print(mat[i][0] + " ");
    }
    
  
  }
  public static void main(String[] args) {
     int[][] mat = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int k = 5;

    // int[] result = printBoundary(mat);

    System.out.println("Boundary elements of matrix ");
    printBoundary(mat);

  }
}