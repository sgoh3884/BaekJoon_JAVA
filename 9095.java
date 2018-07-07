// 9095 1, 2, 3더하기
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[12];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= 11; i++) 
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		for (int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			System.out.println(dp[M]);
		}
	}
} 
