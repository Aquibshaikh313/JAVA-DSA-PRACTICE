import java.util.*;
public class Main {
  static int[] solve(int[] arr){
    int n = arr.length;

    int[] freq = new int[10];

    for(int i = 0 ; i < n ; i++){
      freq[arr[i]]++;
    }

    int k = 0;

    for(int i = 0 ; i < 10 ; i++){
      int count = freq[i];

      for(int j = 0 ; j < count; j++){
        arr[k] = i;
        k++;
      }
     
    }
    return arr;
  }
  public static void main(String[] args) {
     int[] arr = {0,1,1,6,3,5,4,9};
     int[] result = solve(arr);

     System.out.print(Arrays.toString(result));
  }
}