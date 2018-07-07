// 9095 1, 2, 3 더하기
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			System.out.println(calculator(1, 0, N));
		}
	}
	public static int calculator(int count, int sum, int goal) {
		if (sum > goal) return 0;
		if (sum == goal) return 1;
		int now = 0;
		for (int i = 1; i <= 3; i++)
			now += calculator(count++, sum + i, goal);
		return now;
		
	}
} 
