package Recursion;

public class FastPowerOptimized {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println(powerOpti(a,b));
    }
    static int powerOpti(int a, int b){
        if(b == 0) return 1;
        if(b % 2 == 0){
            return powerOpti(a*a, b/2);
        }
        return a*powerOpti(a, b-1);
    }
}
