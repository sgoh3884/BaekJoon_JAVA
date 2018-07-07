// 2522 별찍기 - 12
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int k = N;
		for (int i = 1; i <= 2 * N - 1; i++) {
			if (i <= N) {
				for (int j = i; j < N; j++)
					System.out.print(" ");
				for (int j = 1; j <= i; j++)
					System.out.print("*");
			}
			else {
				k--;
				for (int j = k; j < N; j++)
					System.out.print(" ");
				for (int j = 1; j <= k; j++)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
} 
