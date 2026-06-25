
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