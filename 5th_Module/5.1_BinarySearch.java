


//finding the target element
public class Main {
  static int findTarget(int[] nums, int target){
  int n = nums.length;
  int left = 0 ;
  int right = n - 1;

  while(left <= right){
    int m = (left+right)/2;
    if(nums[m] == target){
      return m;
    }
    else if(nums[m] > target){
      right = m-1;
    }
    else{
      left = m+1;
    }
  }
  return -1;
}
  public static void main(String[] args) {
      int[] nums = {2,5,6,7,9,4};
      int target = 9;

      System.out.print(findTarget(nums,target));

  }
}

//Finding first occurence of the element:

public class Main {
  static int findFirstOcc(int[] arr,int k){
    int n = arr.length;
    int low = 0;
    int hi = n-1;
    int ans = -1;

    while(low <= hi){
      int m = (low + hi)/2;

      if(arr[m] == k){
        ans = m;
        hi = m-1;
        
      }
      else if(arr[m] > k){
        hi = m-1;
      }else{
        low = m+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
     int[] arr = {-5,0,0,1,1,2,3,3,5,5,5,5,5,5,9};
     int k = 5;

     System.out.print(findFirstOcc(arr,k));

  }
}


//finding last occurence of an element

public class Main {
  static int lastOccurence(int[] arr,int k){
    int n = arr.length;
    int low = 0; 
    int hi = n - 1;
    int ans = -1;

    while(low <= hi){
      int m = (low+hi)/2;
      if(arr[m] == k){
        ans = m;
        low = m +1;
      }
      else if(arr[m] > k){
        hi = m - 1;
      }else{
        low = m+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
      int[] arr = {-5,0,0,1,1,2,3,3,5,5,5,5,5,5,9};
     int k = 5;

     System.out.print(lastOccurence(arr,k));

  }
}

//finding local minima
//finding local minima
public class Main {
  static int localMinima(int[] arr){
    int n = arr.length;
   
    if(n==1){
      return arr[0];
    }
    if(arr[0] < arr[1]){
     return arr[0];
    }
    if(arr[n-1] < arr[n-2]){
     return arr[n-1];
    }
   int low = 1; 
   int hi = n-2;
    while(low <= hi){
      int m = (low+hi)/2;
      if(arr[m] < arr[m-1] && arr[m] < arr[m+1]){
        return arr[m];
      }
      else if(arr[m] < arr[m-1] && arr[m] > arr[m+1]){
        low= m+1;
        
      }
      else{
        hi = m-1;
      }
    }

    return -1;
    
  }
  public static void main(String[] args) {
     int[] arr = {12, -4, 7, 0, 19, 5, -1, 8, 3, 15, 2, 9, 6, 14, 1};

     System.out.print(localMinima(arr));
  }
}


//finding the uniq elements in given arr


public class Main {
  static int findUniqElem(int[] arr){
    int n = arr.length;
    if(n == 1) return arr[0];
    if(arr[0] != arr[1]) return arr[0];
    if(arr[n-1] != arr[n-2]) return arr[n-1];

    int low = 1;
    int hi = n-2;
  

    while(low <= hi){
      int m = (low+hi)/2;
      if(arr[m] != arr[m-1]&& arr[m]!= arr[m+1]){
        return arr[m];
      }
      if(arr[m] == arr[m-1]){
        m = m - 1; // m--;
      }
      if(m % 2 == 0 ){
        low = m + 2 ;
      }else{
        hi = m - 1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
      int[] arr = {3,3,2,2,1,1,5,5,7,7,9,0,0};

      System.out.print(findUniqElem(arr));
  }
}