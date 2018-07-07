// 1149 RGB거리
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int[][] N = new int[T+1][4];
		int[][] dp = new int[T+1][4];
		for(int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 3; j++)
				N[i][j] = Integer.parseInt(st.nextToken());
		}
		dp[1][1] = N[1][1];
		dp[1][2] = N[1][2];
		dp[1][3] = N[1][3];
		for(int i = 2; i <= T; i++) {
			dp[i][1] = Math.min(dp[i-1][2], dp[i-1][3]) + N[i][1];
			dp[i][2] = Math.min(dp[i-1][1], dp[i-1][3]) + N[i][2];
			dp[i][3] = Math.min(dp[i-1][1], dp[i-1][2]) + N[i][3];
		}
		System.out.println(Math.min(dp[T][1], Math.min(dp[T][2], dp[T][3])));
	}
} 
