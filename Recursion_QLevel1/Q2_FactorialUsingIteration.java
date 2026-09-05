// product of n to 1 = factorial
public class Q2_FactorialUsingIteration {
    public static void main(String[] args) {
        fact(5);
        fact(1);
        fact(0);
    }
    static void fact(int n){
         if(n<0){
            throw new IllegalArgumentException("Factorial is not define for negative number ,Enter positive number only");
         }

        int ans = 1; // we initialise ans base value
        for(int i = 1;i<=n;i++){
            ans*=i; // now ans update every time until condition false
        }
        System.out.println(ans);

    }
}
