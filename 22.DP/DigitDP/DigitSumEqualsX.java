
import java.util.Arrays;

public class DigitSumEqualsX {
    static String num;
    static int target;
    static long[][][] dp;

    public static long countSum(int pos, int sum, int tight) {
        if(num.length() == pos) {
            return sum == target ? 1 : 0;
        }

        if(sum > target) {
            return 0;
        }

        if(dp[pos][sum][tight] != -1) {
            return dp[pos][sum][tight];
        }

        int limit = tight == 1 ? num.charAt(pos) - '0' : 9;
        long res = 0;

        for(int i = 0; i <= limit; i++) {
            int newTight = 0;

            if(tight == 1 && i == limit) {
                newTight = 1;
            } 
            res += countSum(pos+1, sum + i, newTight);
        }

        return dp[pos][sum][tight] = res;
    }

    public static long count(int n, int t) {
        num = String.valueOf(n);
        target = t;

        dp = new long[num.length()][target+1][2];

        for(long[][] arr1 : dp) {
            for(long[] arr2 : arr1) {
                Arrays.fill(arr2, -1);
            }
        } 

        return countSum(0, 0, 1);
    }
    public static void main(String[] args) {
        System.out.println(count(1234, 8));
    }
}
