// 11057 오르막 수
import java.io.*;

public class Main {
	public static final int mod = 10007;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[1001][10];
		
		for (int i = 0; i <= 9; i++)
			dp[1][i] += 1;
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= j; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= mod;
				}
			}
		}
		long ans = 0;
		for (int i = 0; i <= 9; i++)
			ans += dp[N][i];
		System.out.println(ans % mod);
	}
} 

