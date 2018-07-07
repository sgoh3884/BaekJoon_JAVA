// 11054 가장 긴 바이토닉 부분 수열
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int[][] dp = new int[T+1][2];
		int[] N = new int[T+1];
		String[] str = br.readLine().split(" ");
		for (int i = 1; i <= T; i++) {
			dp[i][0] = 1;
			N[i] = Integer.parseInt(str[i-1]);
			for (int j = 1; j < i; j++) { // 증가
				if (N[i] > N[j] && dp[i][0] < dp[j][0] + 1)
					dp[i][0] = dp[j][0] + 1;
			}
		}
		
		for (int i = T; i >= 1; i--) {
			dp[i][1] = 1;
			for (int j = T; j > i; j--) { // 감소
				if (N[i] > N[j] && dp[i][1] < dp[j][1] + 1)
					dp[i][1] = dp[j][1] + 1;
			}
		}
		
		int ans = 0;
		for (int i = 1; i <= T; i++) { 
			if (dp[i][0] + dp[i][1] - 1 > ans)
				ans = dp[i][0] + dp[i][1] - 1;
		}
		System.out.println(ans);
	}
} 