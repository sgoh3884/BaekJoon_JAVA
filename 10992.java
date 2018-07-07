// 10992 별찍기 - 17
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++)
				System.out.print(" ");
			System.out.print("*");
			if (i > 1 && i != N) {
				for (int j = 1; j <= 2 * (i - 1) -1; j++)
					System.out.print(" ");
				System.out.print("*");
			}
			else {
				for (int j = 2; j <= 2 * i - 1; j++)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
} 
