import java.util.Arrays;

public class MissingNumberFinder {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int b = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == b) {
                b++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, -1, 1 };
        int missingNumber = firstMissingPositive(nums);
        System.out.println("First Missing Positive Number: " + missingNumber);
    }
}
