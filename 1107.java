// 1107 리모컨
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] broken = new boolean[10];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++)
			broken[Integer.parseInt(st.nextToken())] = true;
		
		int answer = Math.abs(N - 100);
		
		for (int i = 0; i <= 1000000; i++) {
			int c = i;
			int len = possible(c);
			if (len > 0) {
				int press = Math.abs(c - N);
				if (answer > len + press) answer = len + press;
			}
		}
		System.out.println(answer);
	}
	
	static int possible(int c) {
		if (c == 0) {
			if (broken[0]) return 0;
			else return 1;
		}
		int len = 0;
		while (c > 0) {
			if (broken[c % 10]) return 0;
			len++;
			c /= 10;
		}
		return len;
	}
} 