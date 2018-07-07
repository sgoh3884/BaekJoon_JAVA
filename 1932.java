// 1932 정수 삼각형
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int[][] N = new int[501][501];
		int[][] dp = new int[501][501];
		int max = 0;
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= i; j++) 
				N[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i <= T; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1)
					dp[i][j] = dp[i-1][j] + N[i][j];
				else if (i == j)
					dp[i][j] = dp[i-1][j-1] + N[i][j];
				else 
					dp[i][j] = Math.max(dp[i-1][j-1] + N[i][j], dp[i-1][j] + N[i][j]);
				
				max = Math.max(max, dp[i][j]);
			}
		}
		System.out.println(max);
	}
} 
