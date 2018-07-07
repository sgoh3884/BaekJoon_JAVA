// 2579 계단 오르기
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int[] N = new int[T+1];
		int[][] dp = new int[T+1][2];
		for (int i = 1; i <= T; i++)
			N[i] = Integer.parseInt(br.readLine());
		
		dp[1][0] = N[1];
		for (int i = 2; i <= T; i++) {
			dp[i][0] = Math.max(dp[i-2][0], dp[i-2][1]) + N[i];
			dp[i][1] = dp[i-1][0] + N[i];
		}
		System.out.println(Math.max(dp[T][0], dp[T][1]));
	}
} 

