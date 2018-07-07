// 2775 큐
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		int old = 999999;
		Queue<Integer> q = new LinkedList<>();
		for (int c = 0; c < T; c++) {
			String[] s = br.readLine().split(" ");
			if (s.length == 2) {
				old = Integer.parseInt(s[1]);
				q.add(Integer.parseInt(s[1]));
				continue;
			}
			
			if (s[0].equals("front")) {
				if (q.isEmpty()) System.out.println(-1);
				else System.out.println(q.peek());
			}
			else if (s[0].equals("back")) {
				if (q.isEmpty()) System.out.println(-1);
				else System.out.println(old);
			}
			else if (s[0].equals("empty")) {
				if (q.isEmpty()) System.out.println(1);
				else System.out.println(0);
			}
			else if (s[0].equals("size")) System.out.println(q.size());
			else if (s[0].equals("pop")) {
				if (q.isEmpty()) System.out.println(-1);
				else System.out.println(q.remove());
			}
		}
	}
} 
