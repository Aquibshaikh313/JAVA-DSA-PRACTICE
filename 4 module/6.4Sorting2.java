import java.util.*;

public class Main {

    static int partition(int[] arr) {

        int n = arr.length;
        int pivot = arr[n - 1];

        int i = 0;

        for(int j = 0; j < n - 1; j++) {

            if(arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, n - 1);

        return i;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {9,8,1,6,5,11,4,7};

        int pivotIndex = partition(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("Pivot Index = " + pivotIndex);
    }
}