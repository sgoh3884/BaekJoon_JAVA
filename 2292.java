// 2292 벌집
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1, maxRoom = 1, add = 6;
		while (maxRoom < N) {
			maxRoom += add;
			add += 6;
			cnt++;
		}
		System.out.println(cnt);
	}
}
