// 7576 토마토
import java.io.*;
import java.util.*;

public class Main {
	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {1, -1, 0, 0};
	public static int day = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] XY = new int[M+1][N+1];
		boolean[][] check = new boolean[1001][1001];
		int[][] ans = new int[1001][1001];
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				XY[i][j] = Integer.parseInt(st.nextToken());
				if (XY[i][j] == 1) {
					check[i][j] = true;
					q.add(i);
					q.add(j);
				}
			}
		}
		int x = 0;
		int y = 0;
		while (!q.isEmpty()) {
			x = q.remove();
			y = q.remove();
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 1 && nx < M + 1 && ny >= 1 && ny < N + 1 && !check[nx][ny] && XY[nx][ny] != -1) { 
					q.add(nx);
					q.add(ny);
					XY[nx][ny] = 1;
					check[nx][ny] = true;
					ans[nx][ny] = ans[x][y] + 1;
				}
			}
		}
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				if (XY[i][j] == 0)
					ans[x][y] = -1;
			}
		}
		System.out.println(ans[x][y]);
	}
} 
