// 10844 쉬운 계단 수
import java.io.*;

public class Main {
	public static final int mod = 1000000000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[101][10];
		
		for (int i = 1; i <= 9; i++)
			dp[1][i] += 1;
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j > 0) dp[i][j] += dp[i-1][j-1]; 
				if (j < 9) dp[i][j] += dp[i-1][j+1];
				dp[i][j] %= mod;
			}
		}
		long ans = 0;
		for (int i = 0; i <= 9; i++)
			ans += dp[N][i];
		System.out.println(ans % mod);
	}
} 
