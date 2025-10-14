
public class Main {
  static int pivotIndex(int[] arr){
   int n = arr.length;
   int totalSum = 0 ; 
   //first calculating the total sum
   for(int i = 0 ; i < n ; i++){
    totalSum += arr[i];
   }

   int leftSum = 0 ;
   for(int i = 0 ; i< n ; i++){
    int rightSum = totalSum - leftSum - arr[i];
    if(leftSum == rightSum){
      return i; //found pivot
    }
    leftSum += arr[i];
   }
   return -1;




  }
  public static void main(String[] args) {
      // int[] arr = {1,7,3,6,5,6};
      int[] arr  = {2,1,-1};

      System.out.print(pivotIndex(arr));
  }
}