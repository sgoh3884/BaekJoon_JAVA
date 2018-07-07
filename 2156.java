// 2156 포도주 시식
import java.io.*;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		int[] M = new int[N+1];
		int[][] dp = new int[N+1][3];
		
		for (int i = 1; i <= N; i++) {
			M[i] = Integer.parseInt(br.readLine());
			dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
			dp[i][1] = dp[i-1][0] + M[i];
			dp[i][2] = dp[i-1][1] + M[i];
		}
		
		System.out.println(Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2])));
	}
} 