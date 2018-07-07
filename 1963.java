// 1963 소수 경로
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		boolean[] prime = new boolean[10001];
		
		for (int i = 2; i < 10000; i++) {
			prime[i] = true;
			if (i == 2 || i == 3) 
				continue;
			if (i % 2 == 0 || i % 3 == 0) {
				prime[i] = false;
				continue;
			}
			float l = Math.round(Math.pow(i, 0.5)) + 1;
			for (int j = 3; j < l; j += 2) {
				if (i % j == 0) {
					prime[i] = false;
					break;
				}
			}
		}


		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count = 0;
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			Queue<Integer> q = new LinkedList<>();
			boolean[] check = new boolean[10001];
			int[] ans = new int[10001];
			check[N] = true;
			q.offer(N);
			
			while (!q.isEmpty()) {
				int now = q.poll();
				
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k <= 9; k++) {
						if (j == 0 && k == 0)
							continue;
						else {
							String[] array = Integer.toString(now).split("");
							array[j] = Integer.toString(k);
							int newValue = Integer.parseInt(array[0] + array[1] + array[2] + array[3]);
							if (!check[newValue] && prime[newValue]) {
								q.offer(newValue);
								check[newValue] = true;
								ans[newValue] = ans[now] + 1;
							}
						}
					}
				}
			}
			if (!prime[M])
				System.out.println("Impossible");
			else 
				System.out.println(ans[M]);
		}
		

	}
	

} 
