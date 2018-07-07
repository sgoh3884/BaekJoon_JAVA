// 1912 연속합
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[T+1];
		int[] N = new int[T+1];
		String[] str = br.readLine().split(" ");
		int ans = Integer.MIN_VALUE;
		for (int i = 1; i <= T; i++) {
			N[i] = Integer.parseInt(str[i-1]);
			dp[i] = Math.max(N[i], dp[i-1] + N[i]);
			if (dp[i] > ans) ans = dp[i];
		}
		System.out.println(ans);
		
	}
} 
