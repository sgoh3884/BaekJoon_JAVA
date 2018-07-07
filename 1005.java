// 2579 계단 오르기
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		String[] str;
		for (int i = 0; i < T; i++) {
			str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int K = Integer.parseInt(str[1]);
			
			int[] D = new int[N+1];
			int[] dp = new int[K+1];
			str = br.readLine().split(" ");
			for (int j = 1; j <= str.length; j++) {
				D[j] = Integer.parseInt(str[j-1]);
				dp[j] = D[j];
			}
			
			int[][] p = new int[K+1][K+1];
			for (int j = 1; j <= K; j++) {
				str = br.readLine().split(" ");
				p[Integer.parseInt(str[0])][Integer.parseInt(str[1])] = 1;
			}
			int end = Integer.parseInt(br.readLine());
			
			
			for (int j = 1; j <= K; j++) {
				for (int m = 1; m <= K; m++) {
					if (p[j][m] == 1) 
						dp[m] = Math.max(dp[m], dp[j] + D[m]);
				}
			}
			System.out.println(dp[end]);
		}
	}
} 