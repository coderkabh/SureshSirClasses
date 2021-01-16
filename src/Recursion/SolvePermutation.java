package Recursion;

import jdk.jfr.Percentage;

public class SolvePermutation {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        SolvePermutation sp = new SolvePermutation();
        sp.permute(str,0 , n-1);
    }
    private void permute(String str, int l, int r){
        if(l == r){
            System.out.println(str);
        }
        for(int i=l; i<=r; i++){
            str = swap(str, l, r);
            permute(str, l+1, r);
            str = swap(str, l ,i);
        }
    }
    private String swap(String str, int i, int j){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
