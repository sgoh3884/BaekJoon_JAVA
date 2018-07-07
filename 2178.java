// 2178 미로 탐색
import java.io.*;
import java.util.*;

public class Main {
	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] XY = new int[N+1][M+1];
		
		for (int i = 1; i <= N; i++) {
			String[] str = br.readLine().split("");
			for (int j = 1; j <= M; j++) 
				XY[i][j] = Integer.parseInt(str[j-1]);
		}
		
		boolean[][] check = new boolean[101][101];
		int[][] ans = new int[101][101];
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(1);
		check[1][1] = true;
		
		while (!q.isEmpty()) {
			int x = q.remove();
			int y = q.remove();
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && XY[nx][ny] == 1 && !check[nx][ny]) {
					q.add(nx);
					q.add(ny);
					check[nx][ny] = true;
					ans[nx][ny] = ans[x][y] + 1;
				}
			}
		}
		System.out.println(++ans[N][M]);
	}
} 
