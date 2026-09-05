package ArrayPractice;
//Find the Largest element in an array

//Brute Force 
import java.util.Arrays;
public class LargestElement {
    public static void main(String[] args) {
        int[] arr={5,2,4,1,9,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(("The largest element in this array is:" +arr[arr.length-1]));
       }

    
}
//TMC o(nlog n)