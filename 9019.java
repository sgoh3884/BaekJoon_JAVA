// 9019 DSLR
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			Queue<Integer> q = new LinkedList<>();
			boolean[] check = new boolean[10001];
			int[] from = new int[10001];
			String[] how = new String[10001];
			q.offer(A);
			check[A] = true;
			
			while (!q.isEmpty()) {
				int now = q.poll();
				int next = 0;
				
				next = (2 * now) % 10000;
				if (!check[next]) {
					q.offer(next);
					check[next] = true;
					from[next] = now;
					how[next] = "D";
				}
				
				next = now - 1;
				if (next == -1) next = 9999;
				if (!check[next]) {
					q.offer(next);
					check[next] = true;
					from[next] = now;
					how[next] = "S";
				}
				
				next = (now % 1000) * 10 + (now / 1000);
				if (!check[next]) {
					q.offer(next);
					check[next] = true;
					from[next] = now;
					how[next] = "L";
				}
				
				next = (now / 10) + (now % 10) * 1000;
				if (!check[next]) {
					q.offer(next);
					check[next] = true;
					from[next] = now;
					how[next] = "R";
				}
				
				if(check[B])
					break;
			}
			String str = "";
			
			while (A != B) {
				str += how[B];
				B = from[B];
			}
			System.out.println(new StringBuffer(str).reverse().toString());
			
		}
		

	}
	

} 
