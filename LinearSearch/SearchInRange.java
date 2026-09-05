public class SearchInRange {

  public static void main(String[] args) {
    int[] numbers = { 5, 12, 18, 7, 25, 30, 40 };
    int target = 25;
    int start = 2;
    int end = 10;
    int result = linearsearchinrange(numbers, target, start, end);
    if (result != -1) {
      System.out.println("Element " + target + " found at index " + result);
    } else {
      System.out.println("Element" + target + "not found in the give range");
    }
  }

  public static int linearsearchinrange(int[] arr, int target, int start, int end) {
    if (arr == null || start < 0 || end >= arr.length || start > end) {
      return -1;
    }
    for (int i = start; i <= end; i++) {
      if (arr[i] == target) {
        return i;

      }
    }
    return -1;

  }

  
}
