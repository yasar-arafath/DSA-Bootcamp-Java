public class GoodArrayChecker {
    public boolean isGoodArray(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = gcd(ans, nums[i]);
        }
        return ans == 1;
    }

    public int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        GoodArrayChecker checker = new GoodArrayChecker();
        int[] nums = { 2, 4, 6 };
        boolean isGood = checker.isGoodArray(nums);
        System.out.println("Is Good Array? " + isGood);
    }
}
