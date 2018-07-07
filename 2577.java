// 2577 숫자의 개수
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[10];
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		long result = A * B * C;
		while (result != 0) {
			num[(int) (result % 10)]++;
			result /= (int) 10;
		}
		for (int i = 0; i < 10; i++)
			System.out.println(num[i]);
	}
}
