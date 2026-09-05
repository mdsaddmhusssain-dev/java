import java.util.Arrays;
import java.util.Scanner;

public class Arraytostring4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] str = new String[4];

        // input lena
        for(int i = 0; i < str.length; i++) {
            System.out.print("Enter value: ");
            str[i] = in.next();
        }

        // print array
        System.out.println(Arrays.toString(str));

        // modify value
        str[1] = "saddam";

        // print again
        System.out.println(Arrays.toString(str));

        in.close(); // good practice
    }
}
