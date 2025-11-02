//Merge sorted overrlapping intervals: Given a sorted list of overlapping intervals, sorted on start time , merge all the overlapping intervals in this sorted list
public class Main {
  static void mergeIntervals(int[][] interval){
    int s1 = interval[0][0], e1 = interval[0][1];
    int n = interval.length;
    for(int i = 1 ; i < n; i++){
      int s2 = interval[i][0];
      int e2 = interval[i][1];

      if(e1>= s2){
        //overlapping
        e1 = Math.max(e1,e2);
      }else{
        System.out.print("("+ s1 + "," + e1 + "),");
         s1 = s2;
         e1 = e2;
      }
    }
    System.out.print("("+ s1 + "," + e1 +")");//printing last interval
  }
  public static void main(String[] args) {
    
    int[][] interval = {{0,2},{1,4},{5,6},{6,8},{7,10},{8,9},{12,14}};
    mergeIntervals(interval);

    //output : (0,4),(5,10),(12,14)


  }
}


//Bucket list prb
//sorted set of non-overlapping intervals : Given a sorted list of non-overlapping intervals based on start time insert a new intervals such that the final list of intervals is also sorted and non overlapping print the intervals



public class Main {
  static void merge(int[][] intervals, int s , int e){
    int n = intervals.length;
    for(int i = 0 ; i < n ; i++){
      int si = intervals[i][0], ei = intervals[i][1];
      if(ei < s){
        //not overlapping
        System.out.printf("(%d,%d)" ,si,ei);
      }else if(e < si){
        //not overlapping
        System.out.printf("(%d,%d)" ,s,e);
        //print all the intervals
        for(int j = i; j < n ; j++){
          System.out.printf("(%d,%d)" ,intervals[j][0],intervals[j][1]);
        }
        return;
      }else {
        //overlapping merge intervals
        s = Math.min(s,si);
        e = Math.max(e,ei);
      }
    }
    System.out.printf("(%d,%d)" ,s,e); //printing last intervals
  
  }
  public static void main(String[] args) {
    
    int[][] intervals = {{1,5},{8,10},{15,20},{21,24},{27,30}};
    int s = 11,  e = 14;
    merge(intervals, s , e);

    
  }
}
// (1,5)(8,10)(11,14)(15,20)(21,24)(27,30)


//finding the first missing natural number in optimnised way 
//TC: O(N);


public class Main {
  static int firstMissNaturalNums(int[] arr){
   int n = arr.length;

   for(int i = 0 ; i < n ; i++){
      while(arr[i] > 0 && arr[i] <=n ){
        int correctIndex = arr[i] - 1; 
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
      }
   }

   //after rearranging,find the first missing number
   for(int i = 0 ; i < n ; i++){
    if(arr[i]!= i + 1){
      return i + 1;
    }
   }
   
   //if all the numbers are in place then missing numbers is n + 1
   return n + 1;

  }
  public static void main(String[] args) {
    
    int[] arr = {4,2,-7,6,9,1,8,3};

    int result = firstMissNaturalNums(arr);
    System.out.println(result);


  }
}