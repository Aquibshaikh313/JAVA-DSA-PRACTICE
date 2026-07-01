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
        if(arr[m] < k && k <= arr[high]){
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


//Median of two sorted array
public class Main {

    static double medianOfTwoSortedArr(int[] A, int[] B) {

        // Always binary search on the smaller array
        if (A.length > B.length) {
            return medianOfTwoSortedArr(B, A);
        }

        int n = A.length;
        int m = B.length;

        int lo = 0;
        int hi = n;

        while (lo <= hi) {

            int cut1 = (lo + hi) / 2;
            int cut2 = (n + m + 1) / 2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : A[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : B[cut2 - 1];

            int r1 = (cut1 == n) ? Integer.MAX_VALUE : A[cut1];
            int r2 = (cut2 == m) ? Integer.MAX_VALUE : B[cut2];

            if (l1 <= r2 && l2 <= r1) {

                if ((n + m) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }

            } else if (l1 > r2) {
                hi = cut1 - 1;
            } else {
                lo = cut1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String[] args) {

        int[] A = {7, 12, 14, 15};
        int[] B = {1, 2, 3, 4, 9, 11};

        System.out.println(medianOfTwoSortedArr(A, B));
    }
}