public class  Q4Palindromcheck {
    

    static int sum = 0;

    static int rev(int n) {
        if (n == 0) {
            return sum;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;

        return rev(n / 10);
    }

    static boolean palin(int n) {
        sum = 0;              // reset reverse
        return n == rev(n);
    }

    public static void main(String[] args) {
        System.out.println(palin(1234321));
        System.out.println(palin(12345));
    }
}
//Palindrome = a number that is the same when read forward and backward.
