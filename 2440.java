// 2440 별찍기 - 3
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i + 1; j++)
				System.out.print("*");
			System.out.println();
		}	
	}
} 
