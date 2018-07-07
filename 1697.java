// 1697 숨바꼭질
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static final int MAX = 200000;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(N);
		boolean[] check = new boolean[MAX + 1];
		int[] ans = new int[MAX + 1];
		check[N] = true;
		
		while (!q.isEmpty()) {
			int now = q.poll();
			
			if (now - 1 >= 0) {
				if (!check[now - 1]) {
					q.offer(now - 1);
					check[now - 1] = true;
					ans[now - 1] = ans[now] + 1;
				}
			}
			
			if (now + 1 <= MAX) {
				if (!check[now + 1]) {
					q.offer(now + 1);
					check[now + 1] = true;
					ans[now + 1] = ans[now] + 1;
				}
			}
			
			if (now * 2 <= MAX) {
				if (!check[now * 2]) {
					q.offer(now * 2);
					check[now * 2] = true;
					ans[now * 2] = ans[now] + 1;
				}
			}
		}
		System.out.println(ans[K]);

	}
	

} 