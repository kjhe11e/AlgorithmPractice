import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicProgrammingCoinChange {
    public static long makeChange(int[] coins, int m) {
        long dp[] = new long[m + 1];
        dp[0] = (long) 1;   // base case
        for(int j = 0; j < coins.length; j++){
            int coin = coins[j];
            for(int k = coin; k < dp.length; k++){
                dp[k] += dp[k - coin];
            }
        }
        return dp[money];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
    }
}
