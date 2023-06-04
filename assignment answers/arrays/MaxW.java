public class MaxW {
    public int maximumWealth(int[][] accounts) {
        int max = -1;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxW solution = new MaxW();

        int[][] accounts = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxWealth = solution.maximumWealth(accounts);
        System.out.println("Maximum Wealth: " + maxWealth);
    }
}
