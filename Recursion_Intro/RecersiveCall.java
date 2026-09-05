public class RecersiveCall {
     public static void main(String[] args) {
        fun(3);
    }


    static void fun(int n) {

        if (n == 0) {      // Base case
            return;
        }

        System.out.println("Before: " + n);

        fun(n - 1);        // Recursive call

        System.out.println("After: " + n);
    }

   
}
    

