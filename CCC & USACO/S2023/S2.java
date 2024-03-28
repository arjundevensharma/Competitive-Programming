import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] heights = new int[N];
        int[][] dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        // Precompute the asymmetric values for all possible crops
        for (int length = 2; length <= N; length++) {
            for (int start = 0; start <= N - length; start++) {
                int end = start + length - 1;
                dp[start][end] = dp[start + 1][end - 1] + Math.abs(heights[start] - heights[end]);
            }
        }

        // Find the minimum asymmetric value for each crop length
        for (int length = 1; length <= N; length++) {
            int minAsymmetricValue = Integer.MAX_VALUE;
            for (int start = 0; start <= N - length; start++) {
                int end = start + length - 1;
                minAsymmetricValue = Math.min(minAsymmetricValue, dp[start][end]);
            }
            System.out.print(minAsymmetricValue);
            if (length < N) {
                System.out.print(" ");
            }
        }
    }
}