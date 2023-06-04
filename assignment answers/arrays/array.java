public class array {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 0 };
        int[] result = buildArray(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
