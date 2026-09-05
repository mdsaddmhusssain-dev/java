public class Q2_UsingRecursion {
    public static void main(String[] args) {
        fact(5);
        fact(6);
        fact(-8);
    }


    // v create this fun for avoiding to much during call
    static void fact(int n ){
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("Factorial is not define for negative number ,so please enter positive num,ber");
        }
        if(n==0 ||n==1){ 
            return 1;
        }
        return n*factorial(n-1);
    }
}
