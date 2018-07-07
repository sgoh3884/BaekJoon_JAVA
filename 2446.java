// 2446 별찍기 - 9
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int k = N;
		for (int i = 1; i <= 2 * N - 1; i++) {
			if (i <= N) {
				for (int j = 1; j < i; j++)
					System.out.print(" ");
				for (int j = i; j <= 2 * N - i; j++)
					System.out.print("*");
			}
			else {
				k--;
				for (int j = 1; j < k; j++)
					System.out.print(" ");
				for (int j = k; j <= 2 * N - k; j++)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
} 
