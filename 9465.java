// 9465 스티커
import java.io.*;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int M = Integer.parseInt(br.readLine());
			int[][] N = new int[2][M+1];
			int[][] dp = new int[M+1][3];
			
			for (int j = 0; j < 2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int k = 1; k <= M; k++) 
					N[j][k] = Integer.parseInt(st.nextToken());
			}
			
			for (int j = 1; j <= M; j++) {
				dp[j][0] = Math.max(dp[j-1][0], Math.max(dp[j-1][1], dp[j-1][2]));
				dp[j][1] = Math.max(dp[j-1][0], dp[j-1][2]) + N[0][j];
				dp[j][2] = Math.max(dp[j-1][0], dp[j-1][1]) + N[1][j];
			}
			
			bw.write(Math.max(dp[M][0], Math.max(dp[M][1], dp[M][2])) + "\n");
		}
		bw.flush();
	}
} 
