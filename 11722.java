// 11722 가장 긴 감소하는 부분 수열
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		
		int[] dp = new int[T+1];
		int[] N = new int[T+1];
		String[] str = br.readLine().split(" ");
		int ans = 0;
		dp[0] = 1;
		for (int i = 1; i <= T; i++) {
			dp[i] = 1;
			N[i] = Integer.parseInt(str[i-1]);
			for (int j = 1; j < i; j++) {
				if (N[i] < N[j] && dp[i] < dp[j] + 1) 
					dp[i] = dp[j] + 1;	
			}
			if (dp[i] > ans)
				ans = dp[i];
		}
		System.out.println(ans);
	}
} 
