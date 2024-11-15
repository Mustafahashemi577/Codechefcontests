import java.util.*;
import java.lang.*;
import java.io.*;

class Too_Many_Oranges
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
        
            boolean result = canEatExactlyKSlices(n, k);
        
            if (result)
                System.out.println("YES");
            else 
                System.out.println("NO");
            }
    }
    private static boolean canEatExactlyKSlices(int n, int k) {
        int[] slices = {10, 11, 12}; 
        boolean[][] dp = new boolean[n + 1][k + 1];
        dp[0][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                for (int slice : slices) {
                    if (j >= slice) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j - slice];
                    }
                }
            }
        }

        return dp[n][k];
    }
}
