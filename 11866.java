// 11866 조세퍼스 문제 0
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) 
			q.add(i);
		
		int count = 0;
		String ans = "";
		while (!q.isEmpty()) {
			count++;
			if (count == M) { 
				ans += q.remove() + ", ";
				count = 0;
			}
			else 
				q.add(q.remove());
		}
		System.out.println("<" + ans.substring(0, ans.length() - 2) + ">");
			
	}
} 
