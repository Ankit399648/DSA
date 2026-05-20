public class MinimumPartitioning{
    public static void main(String[] args) {
        int[] nums = {1, 6, 11, 5};
        int sum = 0;
        for(int num : nums) sum += num;

        int w = sum/2;
        int n = nums.length;

        int[][] dp = new int[n+1][w+1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= w; j++) {
                if(nums[i-1] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j-nums[i-1]] + nums[i-1] , dp[i-1][j]);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        int sum1 = dp[n][w];
        int sum2 = sum - sum1;
        System.out.println(Math.abs(sum1 - sum2));
    }
}