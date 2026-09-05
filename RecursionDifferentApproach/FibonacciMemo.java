import java.util.Arrays;

public class FibonacciMemo {
    public static void main(String[] args) {
       
       int n = 10;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

       System.out.println(fibo(n, dp));
       

    }
    
    // Memoization(Top Down DP)
    static int fibo(int n, int dp[]){
        if(n<2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
}

    

