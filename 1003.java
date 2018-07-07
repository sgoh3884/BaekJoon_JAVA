// 1003 피보나치 함수
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[42];
		dp[1] = 1;
		for (int i = 2; i < 41; i++)
			dp[i] = dp[i-1] + dp[i-2];

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0)
				System.out.println("1 0");
			else 
				System.out.println(dp[N-1] + " " + dp[N]);
		}
	}
} 
