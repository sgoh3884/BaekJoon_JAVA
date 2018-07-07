// 1890 점프
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int[][] num = new int[T+1][T+1];
		long[][] dp = new long[T+1][T+1];
		for (int i = 1; i <= T; i++) {
			String[] s = br.readLine().split(" ");
			for (int j = 1; j <= T; j++) 
				num[i][j] = Integer.parseInt(s[j-1]);
		}
		dp[1][1] = 1;
		for (int i = 1; i <= T; i++) {
			for (int j = 1; j <= T; j++) {
				if (num[i][j] == 0) continue; 
				if (i + num[i][j] <= T) dp[i+num[i][j]][j] += dp[i][j];
				if (j + num[i][j] <= T) dp[i][j+num[i][j]] += dp[i][j];

			}
		}

		System.out.println(dp[T][T]);
		
	
	}
} 