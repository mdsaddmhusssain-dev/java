import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInput {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Number" + (i + 1) + ":");
            list.add(in.nextInt());
        }

        System.out.println("Your number list is: " + list);
    }

}
