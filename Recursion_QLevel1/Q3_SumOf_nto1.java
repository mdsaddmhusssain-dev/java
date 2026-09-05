public class Q3_SumOf_nto1 {
    public static void main(String[] args) {
       callSum(5);
       callSum(-5);
        
    }
    static void callSum(int n ){
        System.out.println(sum(n));
    }
    static int sum(int n ){
        
    if (n == 1) return 1;
    if (n == -1) return -1;
    if (n == 0) return 0;

    if (n > 0)
        return n + sum(n - 1);
    else
        return n + sum(n + 1);

}
    
}
