import java.util.Scanner;

public class Array3forloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 25;
        arr[3] = 43;
        arr[4] = 23;
        System.out.println(arr[2]);
        // input using for loops
        // for(int i =0;i < arr.length;i++){
        // arr[i] = in.nextInt();
        // }

        // for(int i = 0; i < arr.length;i++){
        // System.out.print(arr[i]+ "");
        // }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
