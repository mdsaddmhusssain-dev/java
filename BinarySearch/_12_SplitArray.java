public class _12_SplitArray {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int m = 2;
        // int ans=splitArray(nums,2);
        System.out.println("Minimum Largest Split sum = " + splitArray(nums, m));

    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }
        // Binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum

            int pieces = 1;
            int sum = 0;
            for (int num : nums) {
                if (sum + num > mid) {

                    pieces++;
                    sum = num;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return start;// here start = end;

    }

}
