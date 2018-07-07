// 2747 피보나치 수
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[46];
		
		dp[1] = 1;
		
		for (int i = 2; i <= T; i++) 
			dp[i] = dp[i-1] + dp[i-2];
		
		System.out.println(dp[T]);
	}
} 
