public class RunSum {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        RunSum solution = new RunSum();

        int[] nums = {1, 2, 3, 4, 5};
        int[] result = solution.runningSum(nums);

        System.out.println("Running Sum Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
