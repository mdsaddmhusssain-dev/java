//Factorial //product of n to 1 
public class Q1Nto1 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n==0){
            return;
        }        
        fun(n-1);
        System.out.println(n);
    
        
    }
    
}
