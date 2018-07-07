// 1476 날짜 계산
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int e = 1;
		int s = 1;
		int m = 1;
		int i = 1;
		
		for (;; i++) {
			if (e == 16) e = 1;
			if (s == 29) s = 1;
			if (m == 20) m = 1;
			if (e == E && s == S && m == M) break;
			e++;
			s++;
			m++;
		}
		System.out.println(i);
		
		
	}
} 
