package Recursion;

import java.util.Arrays;

public class SortArrayByRecursion {
    public static void main(String[] args) {
        int[] array = {4,6,3,78,32,9,36,1,64,86};
        sort(array, array.length -1);
        Arrays.toString(array);
    }

    private static int[] sort(int[] arr, int n){
        if(n == 1){
            return arr;
        }
        else{
            if(arr[n-1] > arr[n]){
                swap(arr,arr[n-1],arr[n]);
            }
            return sort(arr,n-1);

        }
    }
    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
/*
* This solution is not correct*/
