//Moore's voting algorithm -->
// Given an array of N integers. find the majority element.Majority element occurs more than n/2 times.
// int[] arr = {2,6,2,2,2,2};
// output comes 2 here
public class Main {
  static int majElem(int[] arr){
    int n = arr.length;
    int maj = -1 , count = 0 ;

    for(int i = 0 ; i < n ; i++){
     if(arr[i]!= maj && count==0){
      maj = arr[i];
      count++;
     }else if(arr[i] != maj){
      count--;
     }else if(arr[i] == maj){
      count++;
     }
    }
    return maj;
  }
  public static void main(String[] args) {
     int[] arr = {2,6,2,2,2,2};

    System.out.print( majElem(arr));

  }
}



//Given an array of 1's and 0's, you are allowed to
//  replace only one 0 with 1. Find the maximum no.
//   of consecutive 1's that can be obtained after
//    making the replacement.

public class Main {
  static int maxConseq(int[] arr){
    int n = arr.length;
    int ans = 0 ;
    int count = 0;

    for(int i = 0 ; i < n ; i++){
      count += arr[i];
    }
    if(count == n){
      return n;
    }
    

    for(int i = 0 ; i < n ; i++){
      if(arr[i] == 0 ){
        int left = 0 , right = 0 ;
        for(int j = i-1 ; j >= 0 ; j--){
         if(arr[j] == 1){
          left++;
         }else{
          break;
         }
        }
        for(int j = i+1 ; j < n ; j++){
          if(arr[j]==1){
            right++;
          }else{
            break;
          }
        }

        int total = left + right + 1;
        if(total > ans ){
          ans = total;
        }
      }
    }

    return ans;

    
  }
  public static void main(String[] args) {
     int[] arr = {1,1,0,1,1,0,1,1};

    System.out.print( maxConseq(arr));

  }
}


//Given an array of 1's and 0's, you are allowed to
//  replace only one 0 with 1. Find the maximum no.
//   of consecutive 1's that can be obtained after
//    swapping at most one 0 with 1(already present in the string)

public class Main {
  static int maxConseq(int[] arr){
    int n = arr.length;
    int ans = 0 ;
    int count = 0;

    for(int i = 0 ; i < n ; i++){
      count += arr[i];
    }
    if(count == n){
      return n; // all are 1s
    }
    

    for(int i = 0 ; i < n ; i++){
      if(arr[i] == 0 ){
        int left = 0 , right = 0 ;
        //count left side 1s
        for(int j = i-1 ; j >= 0 ; j--){
         if(arr[j] == 1){
          left++;
         }else{
          break;
         }
        }
        //count right side 1s
        for(int j = i+1 ; j < n ; j++){
          if(arr[j]==1){
            right++;
          }else{
            break;
          }
        }

         int consOne = left + right + 1; // +1 for swapping this 0 with a 1 elsewhere
        if(consOne > count){            // cannot exceed total 1s available
          consOne = count;
        }

        if(consOne > ans){
          ans = consOne;
        }
      }
    }

    return ans;

    
  }
  public static void main(String[] args) {
     int[] arr = {1,1,0,1,1,0,1,1};

    System.out.print( maxConseq(arr));

  }
}