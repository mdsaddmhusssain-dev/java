public class SpaceOptimization {
    public static void main(String[] args){
            long n =50;
        System.out.println(fibo(n));

    }
    static long fibo(long n){
        if(n<2) return n;
        long a=0;
        long b=1;
        for(long i = 2; i<=n;i++){
            long c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
    
}
