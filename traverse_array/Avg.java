public class Avg {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int Avg;
        int n = arr.length;
        for (int x : arr) {
            sum += x;
        }
        // Average = Sum of the array / no.of array
        Avg = sum / arr.length;
        System.out.println(Avg);

    }

}
