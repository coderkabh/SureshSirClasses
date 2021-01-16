package Recursion;

public class SolvePermutation {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str,0 , n-1);
    }
    static private void permute(String str, int l, int r){
        if(l == r){
            System.out.println(str);
        }
        for(int i=l; i<=r; i++){
            str = swap(str, l, i);
            permute(str, l+1, r);
            str = swap(str, l ,i);
        }
    }
    static private String swap(String str, int i, int j){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
