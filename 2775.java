// 2775 부녀회장이 될테야
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int[][] num = new int[15][15];
		
		for (int i = 1; i <= 14; i++)
			num[0][i] = i;
	
		for (int i = 1; i <= 14; i++) {
			for (int j = 1; j <= 14; j++) { 
				for (int k = 1; k <= j; k++) 
					num[i][j] += num[i-1][k];
			}
		}
			
		for (int c = 0; c < T; c++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(num[k][n]);
		}
	}
} 
