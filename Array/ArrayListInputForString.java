import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInputForString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Enter any 5 FRuits name:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Fruits" + (i + 1) + ":");

            fruits.add(in.nextLine());

        }

        System.out.print("Your fruits list:" + fruits);
    }

}
