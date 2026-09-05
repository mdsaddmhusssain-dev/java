public class TabulationFibo {
    public static void main(String[] args){
        int n  = 50;
        int result = fib(n);
        System.out.println("The Fibonacci of " +n+ " is:" +result);


    }
    static int fib(int n){
        int dp[]= new int[n+1];
         dp[0]=0;
         dp[1]=1;
         for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
         }
         return dp[n];
                



    }
}
