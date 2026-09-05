public class Array {
    public static void main(String[] args) {

        // syntax
        // datatype[] variable-name = new datatype[size];

        int[] a; // declaration of array.a is getting defined in stack
        a = new int[5]; // initialisation:here object is being created in the memory(heap)

        System.out.println(a[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}