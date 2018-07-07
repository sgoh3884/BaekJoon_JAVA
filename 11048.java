// 11048 이동하기
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int[][] num = new int[N+1][M+1];
		int[][] dp = new int[N+1][M+1];
		for (int i = 1; i <= N; i++) {
			str = br.readLine().split(" ");
			for (int j = 1; j <= M; j++) 
				num[i][j] = Integer.parseInt(str[j-1]);
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) 
				dp[i][j] = Math.max(Math.max(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + num[i][j];
		}
		System.out.println(dp[N][M]);
	}
} 
