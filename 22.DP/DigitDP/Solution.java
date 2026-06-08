public class Solution {
    static int k;
    static int[][][][][][] dp;

    public static int digitDP(int pos, int started, int tight, int odd, int even, int remainder, String num) {
        if(pos == num.length()) {
            if(odd == even && remainder % k == 0) {
                return 1;
            }
            else {
                return 0;
            }
        }

        if(dp[pos][started][tight][odd][even][remainder] != -1) {
            return dp[pos][started][tight][odd][even][remainder];
        }

        int limit = tight == 1 ? num.charAt(pos) - '0' : 9;
        int count = 0;

        for(int i = 0; i <= limit; i++) {
            int nextTight = tight == 1 && i == limit ? 1 : 0;

            if(started == 0 && i == 0) {
                count += digitDP(
                    pos+1,
                    0,
                    nextTight,
                    odd,
                    even,
                    remainder,
                    num
                );
            }
            else {
                int nextEven = even, nextOdd = odd;
                if(i % 2 == 0) {
                    nextEven++;
                }
                else {
                    nextOdd++;
                }

                int nextRemainder = (remainder*10 + i) % k;

                count += digitDP(
                    pos+1,
                    1, 
                    nextTight, 
                    nextOdd, 
                    nextEven, 
                    nextRemainder, 
                    num
                );
            }
        }

        return dp[pos][started][tight][odd][even][remainder] = count;
    }

    // dp[pos][started][tight][odd][even][remainder] 
    // digitDP(int pos, int started, int tight, int odd, int even, int remainder, String num)
    public static int solve(int num) {
        String str = String.valueOf(num);
        dp = new int[str.length()][2][2][str.length()][str.length()][21];
        return digitDP(0, 0, 1, 0, 0, 0, str);
    }
    public static void main(String[] args) {
        
    }
}
