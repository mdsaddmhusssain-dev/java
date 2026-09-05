import java.util.*;

public class SetMismach {
        public static void main(String[] args) {

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        findAll(nums);
        
    }

    public static void findAll(int[] nums) {

        int i = 0;

        // 🔁 Cyclic Sort
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // 📦 Store duplicates & missing
        List<Integer> duplicates = new ArrayList<>();
        List<Integer> missing = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                duplicates.add(nums[j]); // duplicate
                missing.add(j + 1); // missing
            }
        }

        // 🖨 Print result
        System.out.println("Duplicates: " + duplicates);
        System.out.println("Missing: " + missing);
    }
}
