public class concat {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] answ = new int[2 * n];
        for (int i = 0; i < n; i++) {
            answ[i] = nums[i];
            answ[i + n] = nums[i];
        }
        return answ;
    }

    public static void main(String[] args) {
        Concat solution = new Concat();

        int[] nums = {1, 2, 3};
        int[] result = solution.getConcatenation(nums);

        System.out.println("Concatenated Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
