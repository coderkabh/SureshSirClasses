package Recursion;

public class FastPower {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(calculatePower(a,b));
    }
    private static int calculatePower(int a, int b){
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a;
        }
        else{
            if(b%2 == 0){
                return calculatePower(a, b/2)*calculatePower(a, b/2);
            }
            else{
                return calculatePower(a, b/2)*calculatePower(a, b/2)*a;
            }
        }
    }
}
