package Recursion;

import java.util.Arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = sumOfElements(arr,5);
        System.out.println(sum);

    }
    private static int sumOfElements(int[] arr, int size){
        if(size <= 0){
            return 0;
        }
        else{
            return (sumOfElements(arr,size-1) + arr[size-1]);
        }
    }
}
