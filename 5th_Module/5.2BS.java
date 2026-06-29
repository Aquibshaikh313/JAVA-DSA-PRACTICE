//rotated bs sorted array


public class Main {
  static int rotatedSortedArr(int[] arr, int k){
    int n = arr.length;
    int low = 0;
    int high = n - 1;
    while(low <= high){
      int m = low + (high - low)/2;
      
      if(arr[m] == k){
        return m;
      }
      
       else if(arr[low] <= arr[m]){
        
        if(arr[low] <= k && k < arr[m]){
        high = m - 1;
        }else{
          low = m + 1;
        }

      }
      
      else{
        if(arr[m] < k && k < arr[high]){
          low = m + 1;
        }else{
          high = m - 1;
        }

      }

    }
     return -1;
  }

  public static void main(String[] args) {
    int[] arr = {8, 9, 10, 1, 2, 3, 4, 5, 6, 7};
    int k = 10;

    System.out.print(rotatedSortedArr(arr,k));
  }
}


//square root of n

public class Main {
  static int squareRoot(int n){
    //one edege case
    if(n == 0) return 0;
    int low= 1;
    int high = n;
    int ans = 0;

    while(low <= high){
      int m = low + (high - low)/2;
      long square = (long) m * m;

      if(square == n)return m;
      else if(square > n){
        high = m - 1;
      }else{
          ans = m;
          low = m+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
     int n = 40;
     System.out.print(squareRoot(n));

  }
}