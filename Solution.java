import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of different coin denominations
        int x = sc.nextInt(); // Desired sum of money
        int[] coins = new int[n];
        
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt(); // Coin denominations
        }
        
        // Initialize DP array with a large value (x + 1)
        int[] dp = new int[x + 1];
        Arrays.fill(dp, x + 1); // x + 1 is used because it's greater than any possible number of coins
        dp[0] = 0; // Base case: 0 coins needed to make amount 0
        
        // Update DP array
        for (int coin : coins) {
            for (int i = coin; i <= x; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        
        // The result is dp[x] if it's not the initialized large value
        int result = dp[x] > x ? -1 : dp[x];
        System.out.println(result);
    }
}
