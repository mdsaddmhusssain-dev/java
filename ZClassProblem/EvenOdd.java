package ZClassProblem;
public class EvenOdd {
    
    public static void main(String[] args) {

        int n = 1234568;

        int even = 0;
        int odd = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0)
                even++;
            else
                odd++;

            n = n / 10;
        }

        if (even%2==0 && odd%2!= odd)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
    

