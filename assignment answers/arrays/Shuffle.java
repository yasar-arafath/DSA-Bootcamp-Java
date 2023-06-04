public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j = 0;
        int k = n;
        for (int i = 0; i < n * 2; i += 2) {
            arr[i] = nums[j++];
        }
        for (int i = 1; i < n * 2; i += 2) {
            arr[i] = nums[k++];
        }
        return arr;
    }

    public static void main(String[] args) {
        Shuffle solution = new Shuffle();

        int[] nums = {1, 2, 3, 4, 5, 6};
        int n = nums.length / 2;
        int[] shuffledArray = solution.shuffle(nums, n);

        System.out.println("Shuffled Array:");
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}
